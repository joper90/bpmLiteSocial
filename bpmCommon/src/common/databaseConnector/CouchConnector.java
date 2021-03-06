package common.databaseConnector;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.support.CouchDbRepositorySupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import repos.CompleteWorkItemRepo;
import repos.CoreStatusRepo;
import repos.ProcessArtifactRepo;
import repos.RequestCallbackRepo;
import repos.StartCaseDetailsRepo;
import repos.WorkItemKeyDetailsRepo;
import artifacts.serverConnection.ServerConnection;

import common.exceptions.BpmLiteException;

public class CouchConnector {

	private HttpClient httpClient = null;
	CouchDbInstance dbInstance = null;
	CouchDbConnector couchConnector = null;
	
	private HashMap<Class<?>, CouchDbRepositorySupport<?>> repoMap = null;
	
	private Logger logger = LoggerFactory.getLogger(CouchConnector.class);
	
	public CouchConnector(ServerConnection serverConnection) 	{
		createConnection(serverConnection);
	}
	
	public CouchConnector(String database, String url, String username, String password) 
	{
	
		ServerConnection serverConnection = new ServerConnection();
		serverConnection.setServer(database);
		serverConnection.setUrl(url);
		serverConnection.setUser(username);
		serverConnection.setPassword(password);
		
		createConnection(serverConnection);
		
		
				
	}
	
	private void createConnection(ServerConnection serverConnection) 
	{
	try {
			
			logger.info("Attempting to connect to database : {} with url {}", serverConnection.getServer(), serverConnection.getUrl());
			logger.info("Using username : {} and password : {}", serverConnection.getUser(), serverConnection.getPassword());
			
			httpClient = new StdHttpClient.Builder()
			        .url(serverConnection.getUrl())
			        .username(serverConnection.getUser())
			        .password(serverConnection.getPassword())
			        .build();
			
			dbInstance = new StdCouchDbInstance(httpClient);
			// if the second parameter is true, the database will be created if it doesn't exists
			couchConnector = dbInstance.createConnector(serverConnection.getServer(), false); // do not create if not exists.
			
			if (couchConnector == null)
			{
				logger.warn("FAIL - cannot connect to the databaes..");
			}else
			{
				logger.info("Sucess. connected to {}", serverConnection.getServer());
			}
			
			//Create the map
			repoMap = new HashMap<Class<?>, CouchDbRepositorySupport<?>>();

			//add knows repos.
			this.addRepo(new CompleteWorkItemRepo(couchConnector));
			this.addRepo(new ProcessArtifactRepo(couchConnector));
			this.addRepo(new RequestCallbackRepo(couchConnector));
			this.addRepo(new StartCaseDetailsRepo(couchConnector));
			this.addRepo(new WorkItemKeyDetailsRepo(couchConnector));
			this.addRepo(new CoreStatusRepo(couchConnector));
			
			
			
		} catch (MalformedURLException e) {
			logger.warn("Cannot parse url...");
			
		}
	}
	
	public CouchDbConnector getConnection() throws BpmLiteException
	{
		if (couchConnector == null) throw new BpmLiteException("Not Connected to database...");
		return couchConnector;
	}
	
	public void addRepo(CouchDbRepositorySupport<?> repoToAdd)
	{
		@SuppressWarnings("rawtypes")
		Class<? extends CouchDbRepositorySupport> clazz = repoToAdd.getClass();
		this.repoMap.put(clazz, repoToAdd);
	}
	
	public CouchDbRepositorySupport<?> getRepo(Class<?> repoClass) throws BpmLiteException
	{
		CouchDbRepositorySupport<?> couchDbRepositorySupport = this.repoMap.get(repoClass);
		if (couchDbRepositorySupport == null) throw new BpmLiteException("No valid Repo for class " + repoClass.getSimpleName());
		return couchDbRepositorySupport;
	}
	
}

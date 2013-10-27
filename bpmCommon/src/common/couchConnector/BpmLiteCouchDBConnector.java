package common.couchConnector;

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

import common.exceptions.BpmLiteException;

public class BpmLiteCouchDBConnector {

	
	private HttpClient authenticatedHttpClient = null;
	private CouchDbInstance dbInstance = null;
	private CouchDbConnector db = null;
	
	private HashMap<Class<?>, CouchDbRepositorySupport<?>> repoMap;
	
	private final Logger log = LoggerFactory.getLogger(BpmLiteCouchDBConnector.class);
	
	public BpmLiteCouchDBConnector(String databaseInstance, String url, String username, String password) throws BpmLiteException
	{
		log.info("Creating dbCounch connector url {}. database {}", url, databaseInstance);
		log.info("Connecting with username {} and password {}", username, password);
		
		try 
		{
		authenticatedHttpClient = new StdHttpClient.Builder()
                .url(url)
                .username(username)
                .password(password)
                .build();
		
		dbInstance = new StdCouchDbInstance(authenticatedHttpClient);
		
		db = dbInstance.createConnector(databaseInstance, true);
		}
		catch (MalformedURLException m)
		{
			throw new BpmLiteException("Incorrect Url, or database connection issue", m);
		}
		
		//Create new repo
		repoMap = new HashMap<Class<?>, CouchDbRepositorySupport<?>>();
		
		//Add the common repos.
		
	}
	
	public CouchDbConnector getCouchDBConnector() throws BpmLiteException
	{
		if (db == null) throw new BpmLiteException("DB Connection now established..");
		return db;
	}

	public boolean addRepo(CouchDbRepositorySupport<?> repoToAdd)
	{
		Class<? extends CouchDbRepositorySupport> clazz = repoToAdd.getClass();
		this.repoMap.put(clazz, repoToAdd);
		return true;
	}
	
			
}

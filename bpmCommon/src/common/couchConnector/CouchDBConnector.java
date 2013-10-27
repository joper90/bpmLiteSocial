package common.couchConnector;

import java.net.MalformedURLException;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.exceptions.BpmLiteException;

public class CouchDBConnector {

	
	private HttpClient authenticatedHttpClient = null;
	private CouchDbInstance dbInstance = null;
	private CouchDbConnector db = null;
	
	private final Logger log = LoggerFactory.getLogger(BpmLiteCouchDBConnector.class);
	
	public CouchDBConnector(String databaseInstance, String url, String username, String password) throws BpmLiteException
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
	}
	
	public CouchDbConnector getCouchDBConnector() throws BpmLiteException
	{
		if (db == null) throw new BpmLiteException("DB Connection now established..");
		return db;
	}
			
}

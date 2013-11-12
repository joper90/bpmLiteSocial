package engine;

import common.databaseConnector.CouchConnector;
import common.utils.BpmLiteCommonUtils;

public class ServiceConfig {

	public static ServiceConfig instance = new ServiceConfig();
	private ServiceConfig (){}; //Singleton.
	
	private CouchConnector dbConnector = new CouchConnector(BpmLiteCommonUtils.getServerConnectionFromFile("serverConnection.json")); //startup a database connector.

	
	
	public CouchConnector getDbConnector() {
		return dbConnector;
	}
	
	public boolean isAlive()
	{
		if (dbConnector != null) return true;
		return false;
	}


	
	
	
	

}

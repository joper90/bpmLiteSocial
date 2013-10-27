package bpmLiteTest;

import org.ektorp.CouchDbConnector;
import org.ektorp.DbInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import common.BpmLiteException;
import common.databaseConnector.CouchConnector;

public class TestDbConnector {

	Logger logger = LoggerFactory.getLogger(TestDbConnector.class);
	
	public static void main(String[] args) throws BpmLiteException {
		new TestDbConnector();
	}

	public TestDbConnector() throws BpmLiteException
	{
		
		logger.info("Starting...");
		CouchConnector couch = new CouchConnector("funkbase","http://127.0.0.1:5984/funkbase","root","staff123");
		CouchDbConnector connection = couch.getConnection();
		
		DbInfo dbInfo = connection.getDbInfo();
		
		System.out.println(dbInfo.getDbName());
		
		//Lets create a statusDocument.
		
	}
	
}

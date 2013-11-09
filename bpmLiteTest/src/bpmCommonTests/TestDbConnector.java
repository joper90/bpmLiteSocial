package bpmCommonTests;

import org.ektorp.CouchDbConnector;
import org.ektorp.DbInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import repos.CoreStatusRepo;
import artifacts.coreStatus.CoreStatus;
import artifacts.coreStatus.Elements;

import common.databaseConnector.CouchConnector;
import common.exceptions.BpmLiteException;

public class TestDbConnector {

	Logger logger = LoggerFactory.getLogger(TestDbConnector.class);
	
	public static void main(String[] args) throws BpmLiteException {
		new TestDbConnector();
	}

	public TestDbConnector() throws BpmLiteException
	{
		
		logger.info("Starting...");
		CouchConnector couch = new CouchConnector("basic","http://127.0.0.1:5984/basic","root","staff123");
		CouchDbConnector connection = couch.getConnection();
		
		DbInfo dbInfo = connection.getDbInfo();
		
		System.out.println(dbInfo.getDbName());
		
		//Lets create a statusDocument.
		
		
		CoreStatus coreStatus = new CoreStatus();
		coreStatus.setStartId("TestServer");
		coreStatus.setServerStartTime(Long.toString(System.currentTimeMillis()));
		Elements elements = new Elements();
		elements.setAdditionalProperties("Alive", "true");
		coreStatus.setElements(elements);
		
		CoreStatusRepo repo = (CoreStatusRepo)couch.getRepo(CoreStatusRepo.class);
		repo.add(coreStatus);
		
		System.out.println(coreStatus.getId());
		
		/*List<CoreStatus> coreList = repo.getAll();
		for (CoreStatus s : coreList)
		{
			System.out.println(s.getStartId());
		}*/
	}
	
}

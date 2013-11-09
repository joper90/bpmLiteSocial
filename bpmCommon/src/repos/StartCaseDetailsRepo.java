package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.startCaseDetails.StartCaseDetails;

public class StartCaseDetailsRepo extends CouchDbRepositorySupport<StartCaseDetails>{

	public StartCaseDetailsRepo(CouchDbConnector db)
	{
		super(StartCaseDetails.class, db);
	}
	
	public void add(StartCaseDetails startCaseDetails)
	{
		startCaseDetails.setDocType("startCaseDetails");
		super.add(startCaseDetails);
	}
	//Add all views/design requests here.. 
	
	
}
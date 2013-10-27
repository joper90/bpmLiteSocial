package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.startCaseDetails.StartCaseDetails;

public class StartCaseDetailsRepo extends CouchDbRepositorySupport<StartCaseDetails>{

	public StartCaseDetailsRepo(CouchDbConnector db)
	{
		super(StartCaseDetails.class, db);
	}
	
	//Add all views/design requests here.. 
	
	
}
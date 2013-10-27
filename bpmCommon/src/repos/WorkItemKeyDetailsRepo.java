package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.workItemKeyDetails.WorkItemKeyDetails;


public class WorkItemKeyDetailsRepo extends CouchDbRepositorySupport<WorkItemKeyDetails> {

	 public WorkItemKeyDetailsRepo(CouchDbConnector db) 
	 {
         super(WorkItemKeyDetails.class, db);
	 }
	
	 //Add extra here
	 
	 /*
	  * 
	  * For example
	  * 
	  *  public List<Sofa> findByColor(String color) {
                return queryView("by_color", color);
        }
	  * 
	  * 
	  */
}

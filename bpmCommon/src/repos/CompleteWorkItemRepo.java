package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.completeWorkItem.CompleteWorkItem;


public class CompleteWorkItemRepo extends CouchDbRepositorySupport<CompleteWorkItem> {

	 public CompleteWorkItemRepo(CouchDbConnector db) {
         super(CompleteWorkItem.class, db);
 }
	
}

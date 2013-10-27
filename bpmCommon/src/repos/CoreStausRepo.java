package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.coreStatus.CoreStatus;
import artifacts.processArtifact.ProcessArtifact;


public class CoreStausRepo extends CouchDbRepositorySupport<CoreStatus> {

	 public CoreStausRepo(CouchDbConnector db) 
	 {
         super(CoreStatus.class, db);
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

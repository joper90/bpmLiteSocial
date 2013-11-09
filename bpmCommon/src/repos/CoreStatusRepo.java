package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.coreStatus.CoreStatus;


public class CoreStatusRepo extends CouchDbRepositorySupport<CoreStatus> {

	 public CoreStatusRepo(CouchDbConnector db) 
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
	 
	 public void add(CoreStatus entity) {
		 entity.setDocType("coreStatus");
		 super.add(entity);
	 }
}

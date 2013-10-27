package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.requestCallback.RequestCallBack;


public class RequestCallbackRepo extends CouchDbRepositorySupport<RequestCallBack> {

	 public RequestCallbackRepo(CouchDbConnector db) 
	 {
         super(RequestCallBack.class, db);
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

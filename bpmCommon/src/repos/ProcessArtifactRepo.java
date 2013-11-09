package repos;

import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

import artifacts.processArtifact.ProcessArtifact;


public class ProcessArtifactRepo extends CouchDbRepositorySupport<ProcessArtifact> {

	 public ProcessArtifactRepo(CouchDbConnector db) 
	 {
         super(ProcessArtifact.class, db);
	 }
	 
	 public void add(ProcessArtifact processArtifact)
	 {
		 processArtifact.setDocType("processArtifact");
		 super.add(processArtifact);
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

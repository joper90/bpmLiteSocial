package bpmCommonTests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import repos.CompleteWorkItemRepo;
import repos.CoreStatusRepo;
import repos.ProcessArtifactRepo;
import repos.RequestCallbackRepo;
import repos.StartCaseDetailsRepo;
import repos.WorkItemKeyDetailsRepo;
import artifacts.completeWorkItem.CompleteWorkItem;
import artifacts.coreStatus.CoreStatus;
import artifacts.processArtifact.DisplayOnly;
import artifacts.processArtifact.FieldData;
import artifacts.processArtifact.GlobalData;
import artifacts.processArtifact.NextStepId;
import artifacts.processArtifact.Participant;
import artifacts.processArtifact.PreviousStepId;
import artifacts.processArtifact.ProcessArtifact;
import artifacts.processArtifact.ProcessData;
import artifacts.processArtifact.Step;
import artifacts.requestCallback.RequestCallBack;
import artifacts.startCaseDetails.StartCaseDetails;
import artifacts.startCaseDetails.StartField;
import artifacts.workItemKeyDetails.KeyFieldDetail;
import artifacts.workItemKeyDetails.WorkItemKeyDetails;

import common.Statics;
import common.databaseConnector.CouchConnector;
import common.exceptions.BpmLiteException;

public class CommonRepoTests {

	
	private CouchConnector connector = null;
	
	@Test 
	public void setupConnector() throws BpmLiteException
	{
		connector = new CouchConnector(	Statics.COUCHDB_DATABASE,
									Statics.COUCHDB_HTTP,
									Statics.COUCHDB_USERNAME,
									Statics.COUCHDB_PASSWORD);
		
		
	}

	@Test (dependsOnMethods = {"setupConnector"})
	public void completeWorkItemRepoTest() throws BpmLiteException
	{
		
		CompleteWorkItem completeWorkItem = new CompleteWorkItem();
		completeWorkItem.setAction("OPEN");
		completeWorkItem.setCaseId("BPM:001");
		completeWorkItem.setProcessId("TESTPROCESS");
		completeWorkItem.setStepId("STEPONE");
		
		CompleteWorkItemRepo repo = (CompleteWorkItemRepo)connector.getRepo(CompleteWorkItemRepo.class);
		
		//Add
		repo.add(completeWorkItem);
		
		String completeId = completeWorkItem.getId();
		
		//Get all (check doc works)
		List<CompleteWorkItem> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		CompleteWorkItem retItem = all.get(0);
		
		Assert.assertEquals(completeId, retItem.getId());
		
		//Delete
		repo.remove(completeWorkItem);
		all = repo.getAll();
		
		Assert.assertEquals(all.size(), 0);		
	}
	
	@Test (dependsOnMethods = {"completeWorkItemRepoTest"})
	public void coreStatusRepoTest() throws BpmLiteException
	{
		
		CoreStatus coreStatus = new CoreStatus();
		coreStatus.setId("NODEOne");
		coreStatus.setServerStartTime(Long.toString(System.currentTimeMillis()));
		coreStatus.setStartId("BPM001");
		
		
		CoreStatusRepo repo = (CoreStatusRepo)connector.getRepo(CoreStatusRepo.class);
		
		//Add
		repo.add(coreStatus);
		
		String completeId = coreStatus.getId();
		
		//Get all (check doc works)
		List<CoreStatus> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		CoreStatus retItem = all.get(0);
		
		Assert.assertEquals(completeId, retItem.getId());
		
		//Delete
		repo.remove(coreStatus);
		all = repo.getAll();
		
		Assert.assertEquals(all.size(), 0);		
	}
	
	@Test (dependsOnMethods = {"coreStatusRepoTest"})
	public void processArtifactRepoTest() throws BpmLiteException
	{
		
		ProcessArtifact processArtificat = new ProcessArtifact();	
		artifacts.processArtifact.Process process = new  artifacts.processArtifact.Process();
		ProcessData processData = new ProcessData();
		
		
		ArrayList<DisplayOnly> dummyDisplay = new ArrayList<DisplayOnly>();
		for (int y=0; y < 3; y++)
		{
			DisplayOnly display = new DisplayOnly();
			display.setFieldId("FieldDisplaOnlyID"+y);
			dummyDisplay.add(display);
		}
		
		ArrayList<FieldData> dummyFieldData = new ArrayList<FieldData>();
		for (int t=0; t < 3; t++)
		{
			FieldData fieldData = new FieldData();
			fieldData.setFieldId("fieldId"+t);
			dummyFieldData.add(fieldData);
		}
		
		ArrayList<GlobalData> dummyGlobal = new ArrayList<GlobalData>();
		for (int d=0; d < 3; d++)
		{
			GlobalData g = new GlobalData();
			g.setGlobalId("globalId"+d);
		}
		
		ArrayList<NextStepId> dummyNextStep = new ArrayList<NextStepId>();
		NextStepId n = new NextStepId();
		n.setStepId("1");
		dummyNextStep.add(n);
		
		ArrayList<PreviousStepId> dummyPrevStepId = new ArrayList<PreviousStepId>();
		PreviousStepId p = new PreviousStepId();
		p.setStepId("0");
		dummyPrevStepId.add(p);
		
		ArrayList<Participant> dummyParticipant = new ArrayList<Participant>();
		Participant pa = new Participant();
		pa.setUserGuid("root");
		dummyParticipant.add(pa);
		
		
		
		ArrayList<Step> dummySteps = new ArrayList<Step>();
		for (int x=0; x < 3 ; x++)
		{
			Step step = new Step();
			step.setDisplayOnly(dummyDisplay);
			step.setFieldData(dummyFieldData);
			step.setGlobalData(dummyGlobal);
			step.setNextStepId(dummyNextStep);
			step.setPreviousStepId(dummyPrevStepId);
			step.setParticipants(dummyParticipant);
			step.setStepId("Step"+x);
			step.setStepName("Step"+x+" name");
			dummySteps.add(step);
			
		}
		
		
		processData.setAuthor("Joe");
		processData.setProcessDescription("Test Process");
		processData.setProcessName("TestProcess");
		processData.setVersion("0.01");
		processData.setSteps(dummySteps);	
		process.setUniqueGuid("GUID1234567");
		process.setProcessData(processData);
		
		processArtificat.setProcess(process);
	
		
		ProcessArtifactRepo repo = (ProcessArtifactRepo)connector.getRepo(ProcessArtifactRepo.class);
		
		//Add
		repo.add(processArtificat);
		
		String completeId = processArtificat.getId(); 
		
		//Get all (check doc works)
		List<ProcessArtifact> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		ProcessArtifact retItem = all.get(0);
		
		Assert.assertEquals(completeId, retItem.getId());
		
		//Delete
		repo.remove(processArtificat);
		all = repo.getAll();
		
		Assert.assertEquals(all.size(), 0);		
	}

	@Test (dependsOnMethods = {"processArtifactRepoTest"})
	public void requestCallBackRepoTets() throws BpmLiteException
	{
		RequestCallBack requestCallback = new RequestCallBack();
		requestCallback.setRequestGuid("BLAH");
		requestCallback.setUserGuid("tibco-admin");
		requestCallback.setWorked("true");
		
		RequestCallbackRepo repo = (RequestCallbackRepo) connector.getRepo(RequestCallbackRepo.class);
		
		//Add
		repo.add(requestCallback);
				
		String completeId = requestCallback.getId(); 
				
		//Get all (check doc works)
		List<RequestCallBack> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		RequestCallBack retItem = all.get(0);
		
		Assert.assertEquals(completeId, retItem.getId());
			
		//Delete
		repo.remove(requestCallback);
		all = repo.getAll();
		
		Assert.assertEquals(all.size(), 0);	
		
	}
	
	@Test (dependsOnMethods = {"requestCallBackRepoTets"})
	public void startCaseDetailsRepoTest() throws BpmLiteException
	{
		StartCaseDetails startCaseDetails = new StartCaseDetails();
		
		List<StartField> fieldDetailsArray = new ArrayList<StartField>();
		
		for (int x=0; x<3; x++)
		{
			StartField fieldDetails = new StartField();
			fieldDetails.setFieldId("fieldID"+x);
			fieldDetails.setFieldType("STRING");
			fieldDetails.setInitialValue("cat");
			fieldDetails.setName("Animal");
			fieldDetailsArray.add(fieldDetails);
		}
		
		startCaseDetails.setCallBackGuid("123124124");
		startCaseDetails.setCaseId("123123");
		startCaseDetails.setStartFields(fieldDetailsArray);
		startCaseDetails.setProcessId("BPM001");
		startCaseDetails.setRequireCallback(true);
		
		
		StartCaseDetailsRepo repo = (StartCaseDetailsRepo) connector.getRepo(StartCaseDetailsRepo.class);
		
		//Add
		repo.add(startCaseDetails);
						
		String completeId = startCaseDetails.getId(); 
						
		//Get all (check doc works)
		List<StartCaseDetails> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		StartCaseDetails retItem = all.get(0);
			
		Assert.assertEquals(completeId, retItem.getId());
			
		//Delete
		repo.remove(startCaseDetails);
		all = repo.getAll();
				
		Assert.assertEquals(all.size(), 0);	
	}
	
	@Test (dependsOnMethods = {"startCaseDetailsRepoTest"})
	public void workItemKeyRepoTest() throws BpmLiteException
	{
		WorkItemKeyDetails workItemKeyDetails = new WorkItemKeyDetails();
		List<KeyFieldDetail> keyFieldDetailsArray = new ArrayList<KeyFieldDetail>();
		for (int x=0; x<3;x++)
		{
			KeyFieldDetail keyFieldDetails = new KeyFieldDetail();
			keyFieldDetails.setFieldId("KeyID"+x);
			keyFieldDetails.setGlobal(false);
			
			keyFieldDetailsArray.add(keyFieldDetails);
		}
		
		workItemKeyDetails.setCallBackGuid("123123");
		workItemKeyDetails.setDisplayOnly("12");
		workItemKeyDetails.setKeyFieldDetails(keyFieldDetailsArray);
		workItemKeyDetails.setOrderList("123");
		workItemKeyDetails.setProcessId("BPM001");
		workItemKeyDetails.setRootKey("BLAH");
		workItemKeyDetails.setStepId("STEPONE");
		workItemKeyDetails.setUniqueFormGuid("123");
		workItemKeyDetails.setUserKey("123");
		workItemKeyDetails.setWorked(true);
		
		WorkItemKeyDetailsRepo repo = (WorkItemKeyDetailsRepo) connector.getRepo(WorkItemKeyDetailsRepo.class);
		
		//Add
		repo.add(workItemKeyDetails);
						
		String completeId = workItemKeyDetails.getId(); 
						
		//Get all (check doc works)
		List<WorkItemKeyDetails> all = repo.getAll();
		Assert.assertEquals(all.size(), 1);
		WorkItemKeyDetails retItem = all.get(0);
			
		Assert.assertEquals(completeId, retItem.getId());
			
		//Delete
		repo.remove(workItemKeyDetails);
		all = repo.getAll();
				
		Assert.assertEquals(all.size(), 0);	
		
	
		
	}
	
	
}


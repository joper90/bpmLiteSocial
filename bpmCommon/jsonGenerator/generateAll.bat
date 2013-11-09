@echo off
echo Generating all json mappings..


call jsonschema2pojo.bat -s ..\rawJsonDocs\processArtifact.json -T JSON -t ..\src -p artifacts.processArtifact
echo done.. [processArtifacts]
call jsonschema2pojo.bat -s ..\rawJsonDocs\completeWorkItem.json -T JSON -t ..\src -p artifacts.completeWorkItem 
echo done.. [completeWork]
call jsonschema2pojo.bat -s ..\rawJsonDocs\requestCallBack.json -T JSON -t ..\src -p artifacts.requestCallback 
echo done.. [requestcallBack]
call jsonschema2pojo.bat -s ..\rawJsonDocs\workItemKeyDetails.json -T JSON -t ..\src -p artifacts.workItemKeyDetails 
echo done.. [workItemKeyDetails]
call jsonschema2pojo.bat -s ..\rawJsonDocs\startCaseDetails.json -T JSON -t ..\src -p artifacts.startCaseDetails 
echo done.. [startCaseDetails]
call jsonschema2pojo.bat -s ..\rawJsonDocs\coreStatus.json -T JSON -t ..\src -p artifacts.coreStatus 
echo done.. [coreStatus]
echo all done...

pause

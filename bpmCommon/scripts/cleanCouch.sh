#!/bin/bash
echo 'This script will kill off and recreate any database...'
echo $'\nYOU WILL NUKE THE CURRENT DATABASE.'
echo $'\n\n'
read -p "Press [Enter] key to start rebuilding the databases..."
echo building testDatabase..
curl -X DELETE "http://root:staff123@127.0.0.1:5984/basictest";echo Deleted Database..
curl -X PUT "http://root:staff123@127.0.0.1:5984/basictest";echo Created Database..
echo Creating initial design documents.
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/CoreStatus","views":{"all":{"map":"function(doc) { if(doc.docType=\"coreStatus\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/CompleteWorkItem","views":{"all":{"map":"function(doc) { if(doc.docType=\"completeWorkItem\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/ProcessArtifact","views":{"all":{"map":"function(doc) { if(doc.docType=\"processArtifact\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/RequestCallback","views":{"all":{"map":"function(doc) { if(doc.docType=\"requestCallback\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/StartCaseDetails","views":{"all":{"map":"function(doc) { if(doc.docType=\"startCaseDetails\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basictest/ -H 'Content-Type: application/json' -d '{"_id":"_design/WorkItemKeyDetails","views":{"all":{"map":"function(doc) { if(doc.docType=\"workItemKeyDetails\") { emit(null, doc); }  }"}}}'
echo building testDatabase..
curl -X DELETE "http://root:staff123@127.0.0.1:5984/basic";echo Deleted Database..
curl -X PUT "http://root:staff123@127.0.0.1:5984/basic";echo Created Database..
echo Creating initial design documents.
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/CoreStatus","views":{"all":{"map":"function(doc) { if(doc.docType=\"coreStatus\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/CompleteWorkItem","views":{"all":{"map":"function(doc) { if(doc.docType=\"completeWorkItem\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/ProcessArtifact","views":{"all":{"map":"function(doc) { if(doc.docType=\"processArtifact\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/RequestCallback","views":{"all":{"map":"function(doc) { if(doc.docType=\"requestCallback\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/StartCaseDetails","views":{"all":{"map":"function(doc) { if(doc.docType=\"startCaseDetails\") { emit(null, doc); }  }"}}}'
curl -X POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d '{"_id":"_design/WorkItemKeyDetails","views":{"all":{"map":"function(doc) { if(doc.docType=\"workItemKeyDetails\") { emit(null, doc); }  }"}}}'
read -p "Press [Enter]"
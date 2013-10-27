#!/bin/bash
echo 'This script will kill off and recreate any database...'
echo $'\nYOU WILL NUKE THE CURRENT DATABASE.'
echo $'\n\n'
read -p "Press [Enter] key to start rebuilding the database..."
curl -X DELETE "http://root:staff123@127.0.0.1:5984/basic";echo Deleted Database..
curl -X PUT "http://root:staff123@127.0.0.1:5984/basic";echo Created Database..
echo Creating inital design documents.
curl curl -vX POST http://root:staff123@127.0.0.1:5984/basic/ -H 'Content-Type: application/json' -d {}
read -p "Press [Enter]"
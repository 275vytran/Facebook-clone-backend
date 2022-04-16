# facebook-clone-backend

This project is creating a clone version of Facebook integrated with features:
- Authentication
- Posts
- Story
- Friends
- Like Comment & Share

Techniques: Cassandra, Spring Boot, Java, REST API, React, Firebase

Cre: InterviewWithBunny

To start the react website
cd facebook-clone
npm start
-----------
imrc
ccc
--------
To connect cassandra:
cd cassandra folder
cd bin 
cassandra -f

in other terminal
cd cassandra folder
cd bin
cqlsh
----------
cassandra command:
describe keyspaces; => check name of projects we have
use {name of project}; => go to that project
describe tables;  => check name of tables
select * from {name of table} => open content of table
truncate {table name} => remove all content in the table
DROP TABLE {table name} => delete table

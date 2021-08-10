### mongoDB
- docker pull mongo:4.1
- docker run -p 27017:27017 --name mongo -d mongo:4.2
- download MongoDB Compass
- connect to mongoDB in docker
- mongodb://localhost  // mongodb://帳號:密碼@localhost


### Data 

<table>
<tr>
  <th>* MongoDB</th>	<th>* MySQL</th>
</tr>
<tr>
  <td>database</td>	<td>database</td>
</tr>
<tr>
  <td>collection</td>	<th>table</td>
</tr>
<tr>
  <td>document</td>	<td>row</td>
</tr>
<tr>
  <td>field</td>	<td>column</td>
</tr>
	
</table>  


### command

- cls : clear
- show dbs
- use <db>
- createCollection(name, {size: ..., capped: ..., max: ...}) -> create collection and set properties
- db.getCollectionNames()
- db.getName()
- db.dropDatabase()

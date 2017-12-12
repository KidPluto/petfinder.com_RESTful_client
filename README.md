# Petfinder.com RESTful client

Petfinder.com 
* [API docs](https://www.petfinder.com/developers/api-docs).
* [Developer api key]([https://www.petfinder.com/developers/api-key).
* Example of calling api to retrieve random pet id.
  * Using browser ````http://api.petfinder.com/pet.getRandom?key=<api-key>````
  * Using command line ````curl http://api.petfinder.com/pet.getRandom?key=<api-key>````
  * The response:
````xml
<?xml version="1.0" encoding="iso-8859-1"?>
<petfinder xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="http://api.petfinder.com/schemas/0.9/petfinder.xsd">
 <header>
  <version>0.1</version>
  <timestamp>2017-12-12T21:51:48Z</timestamp>
  <status>
   <code>100</code>
   <message />
  </status>
 </header>
 <petIds>
  <id>39720173</id>
 </petIds>
</petfinder>
````
Javaranch [thread](https://coderanch.com/t/677693/java/understand-json-petfinder-doesn-match) about how their json sucks. 

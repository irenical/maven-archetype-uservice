# maven-archetype-uservice
Maven archetype to generate a thrift based micro service

### Usage

#### Generating a new micro service project
mvn archetype:generate -DarchetypeGroupId=org.irenical.maven -DarchetypeArtifactId=archetype-uservice

#### Defining your own service contract
This archetype will generate a working service, with a hello-world-like contract. You can change it in the generated **[yourservice]-contract** project, in the file **src/main/thrift/[yourproject].thrift**. After you make your changes, running mvn compile in the contract project will call the thrift compiler. Running mvn install will expose these changes to your **[yourservice]-server** project.

#### Running your micro service
Simply call **java -jar target/[yourservice]-server-[version].jar** in the server project folder.

#### Changing configuration
This will deppend on you jindy binding. The default behaviour reads the configuration file present in **src/main/resources/config.properties** in your server project.

#### Requirements
You need to have thrift compiler installed in order to build the generated project.
https://thrift.apache.org/tutorial/


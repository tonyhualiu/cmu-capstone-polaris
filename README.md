cmu-capstone-polaris
====================

#Before working on the project

Please read the github working flow before working on the project.

#How to start

Import the project to your favourite IDE (eclipse or netbeans). you just need to choose where your pom.xml is located.

#How to test my code

You can use a fancy IDE with tomcat 7 server installed with it. Eclipse J2EE is a good choice. Alternatively, you can use Netbeans.

You can also download apache tomcat 7 server to your directory and start it from command line. If you choose to do that, several steps should be followed:

* use command in the directory where you have your pom.xml:

`mvn package`

It will generate the .war file in the /target directory.

* copy the .war file to your tomcat server, under webapps/ directory.

Then tomcat will automatically deploy the webapp.

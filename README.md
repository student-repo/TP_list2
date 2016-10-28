PART I

1) Download maven https://maven.apache.org/download.cgi
2) Copy to /usr/local/apache-maven
3) Unzip unzip apache-maven-3.3.9-bin.zip
4) Set Maven environment variables
  $ export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.9
  $ export M2=$M2_HOME/bin
  $ export MAVEN_OPTS=-Xms256m -Xmx512m
5) Add Maven bin directory location to system path
  $ export PATH=$M2:$PATH
6) Verify Maven installation
  $ mvn --version
7) Creating a project
  $ mvn archetype:generate -DgroupId=pt.trainings.maven -DartifactId=scratch -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
  change inside pom.xlm junit version to 4.12
8) Import project to intellij
  File > New > Project from Existing Sources > /home/ubuntu-master/scratch > Maven > use/import libraires junit 4+
  or mvn idea:idea
9) Build the Project
  $ mvn package
10) You may test the newly compiled and packaged JAR with the following command:Which will print the quintessential:
  $ java -cp target/scratch-1.0-SNAPSHOT.jar pt.trainings.maven.App
  Which will print the quintessential:
  Hello World!
11) Install artifact
  $ mvn install

PART II
  instruction -> QuikMavenExercise.pdf

PART III

1) $ mvn archetype:generate
2) Accept the default value for ‘version’
3) Enter pt.trainings.maven.templating for ‘groupId’ property
4) Enter sample for ‘artifactId’ property
5) Accept the default value of 1.0-SNAPSHOT for ‘version’ property
6) Accept the default value of pt.trainings.maven.templating for
‘package’ property
7) Review and accept the values by typing ‘Y’ at the end
8) Import project to intellij
change inside pom.xlm junit version to 4.12
  File > New > Project from Existing Sources > /home/ubuntu-master/scratch > Maven > select "search for projects recursively"


PART IV
  instruction -> QuikMavenExercise.pdf

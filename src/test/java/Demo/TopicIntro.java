/* if You want to execute Yor automation Tests from CommandLine /command prompt
   using the maven commands -  

1. Then we need to end the classname with Test,Then only 
  it will run from command line , otherwise it will not be recognized
2. We need to add Maven Surefire Plugin
 
 *Maven Build Life Cycle Phases - 
 *mvn clean - cleaning the build errors at structural levels
 *mvn compile - compile for compiling the test for compile errors
 *mvn test -  for executing the test ,
 *        performs clean , compile and test
 *
 *
 *maven surefire Reports - refresh the project 
 *  target > surefire reports> index.html> open with browser
 *  
 *
 *All these project jar files/ dependencies are downloaded at 
 *c drive> users > username(lenovo) folder >.m2 folder> repository >org for reqired jar mentioned in pom.xml file
 *
 * mvn test - will check these required jar files for this project are available 
 *in my machine or not . it will verify the required jar files are availe at this particlar path or not .
 * and if they are not there or present it will download first all the jars from the maven repository .
 * 
 * mvn Test - All the classes ending with Test will be excuted at once one by one . 
 *            all the test in all the classes will be excuted via mvn test command 
 *            
 *            
 * for a particular test classes to run , create testng.xml file 
 * search for maven surefire plugin for testng configuration > copy the configuration > add in your pom.xml file at maven surefire plugin , after the version tag 
 
 * Now run in command  prompt - 
 * mvn test   // this time only specified classes in testng.xml  will run
                this time it will consider the testng.xml file
 *
 * mvn -Dtest =TwoTest test   (from this command only specified class test will get executed)
 
 *categorizing the test case into smoke and sanity and regression and then run them from the commnad Line 
 *we have to create profiles , then , 
 *Categorizing them for a particular type of test and then create profile - 
 *code link can copy from qafox video Maven jenkins part2    
 *
 *
 * Running jenkins command in cmd - 
 * java -jar jenkins.war
 * 
 * 
 * Create a new Job in Jenkins
Jenkins Home > New Item > Give Job name and select 'Freestlye' project

Copy the Project to the Jenkins folder (C > Users > Username > Jenkins)

Select Advanced in Jenkins > Select Use custom workspace checkbox 

Directory - Give your Project Path

Build > Add build step > Invoke top-level Maven targets > Select Maven Version >type test command without mvn in the field and save

Build Now to Run

Click on the Results > Output Console

Installing TestNG Results Plugin

Manage Jenkins > Plugin Manager > Available > TestNG > Install without restart

Job > Configure > Post Build Actions > Publish TestNG Results

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */          





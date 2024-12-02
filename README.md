## Spring Boot Notes <br>

##Controller - Model - View <br>
Controller through contacting model through viewing things <br>

Payilagam 39 mints watch videos Spring boot introduction video above MVC <br>


Dependency Injection example (Video 2) <br>

Class Home  <br>
Net connection Modem,  <br>
{ <br>

@Auto wired  <br>
@Component <br>
@Qualifier(BSNL or Airtel))// using it we can decided which connection  <br>

Home h = New Home(); // it's hard Cording  <br>



}



InterFace net connection  <br>
{ <br>

} <br>


@Component(BSNL) // default spring container it will create in JVM BSNL also for Airtel depend how class we create and object
Class BSNL implement net connection  <br>
{ <br>

} <br>


@Component(Airtel) <br>
Class Airtel implement net connection  <br>
{ <br>

} <br>

// External service like @Component BSNL and @Component Airtel any service can be used through (class Home @component @ Auto Wired) I can connect internet  <br>

Injecting object to other object <br>
1) Avido tight coupling <br>
2) Achieved by @component , @autowired @qualifer <br>
3) unit testing will be easier  <br>
One Class Object place in another class without tight coupling @Component, @AutoWired, Called Dependancy Injection<br>






##ServerConfiguration are inBuilt its Auto Configuration like Apace TomCat<br>

##Maven Configuration Management Tool< br>
InBuild in SpringBoot<br>
No WAR Files / JAR Files (MVN Repository Available according our Need )<br>
Maven is German Word knowledge Accumlator<br>

Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.<br>

Oracle Jar File is Java Class File<br>
MySQL JAR --> Version is required for MAVEN<br>
XLS JAR<br>
POM  -> JAR<br>

https://repo1.maven.org/maven2/<br>


MAVEN (Strength)<br>
1. Give Default Project Structure<br>
2. Depenedencies Auto download<br>
3. Auto Complie<br>
4. Server Stop & Start<br>


## C:\Users\u\.m2\repository ## It local Repository were i can see Maven Details POM Details <br> local Laptop path for Maven<br>


STS & Ecplise <br>
1)Group ID  means -> Package Name
2) ArtiFact ID means-> Project Name
3) Version ID




STS Basic things to build a Maven Project <br>
Spring Dependancy Injection<br>
Spring Web - For Web Application<br>
Thyme Leaf - For Front End<br>
JPA - Spring Data JPA<br>
Spring Boot Actuator - For Debuging<br>






##Core Java -> .class Java<br>
##Advance Java WebApplication -> WAR Files has lot of class <packaging>WAR</packaging><br>




POJO Classes (Plain Old Java Object) which use Getter & Setter Which use like Private Variables<br>

Package com.example.demo;<br>

public class Home {<br>

//POJO Classes<br>

private String<br>


## Spring Create only one Object. It wont call uncessary object that why it is called Single Ton Project<br>


## Bean: Object in class create as a (Bean) of object Home.Class) in the spring Container.<br>



https://www.youtube.com/watch?v=vq7eTSapdv0&list=PLgWpUXNR_WCc_VontznRnCUdul5Zp1x3c&index=3 (35:55)

## 1. Singleton Scope
## 2. Prototype Scope : If we create mutiple Object its called Prototype Scope.<br>

Bean object 



// Bean of object Home.Class<br>
Home h = Context.getBean(Home.Class)<br>
h.connect(); // Object in Home Class<br>

Home h = Context.getBean(Home.Class)<br>
h.connect(); Object in Home Class
}<br>
}<br>

OutPut<br>

Home Home<br>
Connect Internet<br>
Connect Internet<br>



















 

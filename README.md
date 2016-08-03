# Spring Boot Todo REST
This is a test application to explore the basics of SpringBoot.  
  
Todo REST is the simplest possible implementation of full CRUD, and I chose it
to test how quickly (and with how little configuration) a Spring Boot project
could be configured towards the end of creating a RESTful service that conforms
to level 3 on the Richardson Maturity model (that is, implements full HATEOAS)...
  
  
The answer is pretty darn quickly with with virtually no configuration.  

### Technologies
* Springboot
* Springboot CLI
* Springboot initializer (start.spring.io)
* Eclipse
* H2
* Hibernate
* JPA
* Spring Core, MVC, REST
* Jackson/FasterXML

### Instructions
The application uses the springboot-starter-web to run on an embedded Tomcat server, 
which is configured to run on it's default port (8080).  
  
Springboot auto-magically builds the application when run from main, pulling in the 
desired starter dependencies (which in turn include the dependencies listed above).  
  
As evidenced in the TodoRepository interface, the mapping to the Todo resources is 
"/todos". If you navigate to root (http://localhost:8080) in a browser the
@RepositoryRestResource annotation auto-magically provides HATEOAS which will direct 
you to the accessibility of the provided REST service.  
  
I strongly recommend using Postman to create and consume Todo resources.  
  
NOTE: As the database for this project is H2, all Todos are held in memory and will be 
lost between builds. Feel free to create an @Bean to inject some entities on load for
testing purposes.

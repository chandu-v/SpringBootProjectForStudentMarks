# Spring Boot Demo

## Introduction

The repository explores the basic fundamentals of connecting API to the MySql Database.

## Build

I used maven as a build tool. All the dependecies required in the project are addressed in the pom.xml file in the root directory.

* To run the repository locally in your machine, the following prerequisites are necessary.
  * JAVA 8
  * maven
  * mysql 8+
  * IDE like STS, Intellij, VS Code etc.
* Once the above prerequisites are installed, and are present in the class path, clone the repository.
* Change the user name and password of the mysql database in the applications.properties file.
* Now run the below command in the root directory-

    ```bash
        mvn spring-boot:run
    ```

* If everything is fine the application should be up and running in the port number 8080.

## Exploring the flow

* The Application starts running from the Application.java file from the main method.
* The SpringBootApplication annotation indicates the class as the first runnable instance.
* Controller/RestController/Service/Repository/Entity Annotations helps spring to place the classes in the classpath to easily detect the instances.
* Whenever a request is made the spring boot framework looks for the endpoint with the matching request method type in the Controller annotated classes. Get is the default method if no request method is provided.
* Service class is supposed to handle the business logic
* Repository uses JPA libraries to map the Entity classes to the models/table in the database. ORM concepts can be referred for more details. This removes the overhead of configuring and writing a lot of code to perform minimalistic CRUD Operations.
* The Database and other configurations could be done in the applications.properties files.

## Hibernate

Hibernate uses ORM [ Object Retional Mapping ] Paradigm. It saves a lot of time. We can use the Object Oriented paradigm to handle simple and complex SQL related queiries. It is a abstract layer over the complex Prepared Statements used in JDBC.

In this all the tables are written as Entity classes in Java

### Hibernate Mappings

#### OneToOneMapping

#### OneToManyMapping

#### ManyToOneMapping

Example: Many Employees could be mapped to a one department/project

## ManyToManyMapping

## Advantages of Spring

* Spring boot is production ready to scale for larger deployements.
* The Spring framework takes care of the Application Context and all the dependencies injection.
* By this the developer needs to worry about the business logic only.

# Welcome to My Lab!!!

What is this project? To make a long story short, this project serves as a laboratory for experimenting with concerns 
about clean architecture.

After reading about multi-module Maven projects, I decided to try it on a Spring Boot project, in conjunction with the 
principles of clean architecture. Thus, this project was born as a tool for studying and gaining a deep understanding of
how these two concerns could be applied together.

## Why use multi-modules structure?

The concerns related to Clean Architecture are, of course, independent of implementation. However, in past projects in
which I was involved, the isolation of each layer was more of a convention that should be respected by all developers 
involved with these projects... well, that doesn't always happen.

Using the multi-module feature allows us to create a physical boundary between our core layer and all other boundaries 
involved, even isolating the dependencies associated with each layer. This ensures that our core cannot access any
third-party libraries, even if a developer who is not familiar with the Clean Architecture philosophy tries to use, 
let's suppose, an annotation provided by the Spring Framework (let's say, maybe this developer tries to create a Use
Case as a Spring @Service...); what will happen? Well, the dependency simply won't be found, because we isolate each 
module's dependencies in its own pom.xml! It ensures that we have a fine control about which dependencies can be used in
the core of our application, making any addition fully conscious.

## How to use it?

Just run:

```shell
mvn clean && mvn install && mvn spring-boot:run -pl boundaries
```

And be happy 😁
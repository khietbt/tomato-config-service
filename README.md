# tomato-config-service

Setting up this centralized configuration service is the first step to apply microservices with Spring Cloud

Here, instead of a normal Git repository, an H2 backend is used to avoid unnecessary settings, such as private key,
external credentials...

Liquibase is also selected to initialize database.

## JDBC

Instead of git, JDBC backend is used in this demo with 2 profiles:

* H2 to run in local
* MySQL for production

## Build & Run

The JDBC profile must be active. For example:

```shell
mvn clean package && java -jar -Dspring.profiles.active=local,jdbc target/tomato-config-service-1.0.0.jar
```
FROM openjdk:21
EXPOSE 8080
COPY target/spring-oracle.jar spring-oracle.jar
ENTRYPOINT ["java","-jar","/spring-oracle.jar"]

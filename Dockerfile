FROM openjdk:21-jdk
EXPOSE 2222
COPY target/SpringBootOracle-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]

FROM adoptopenjdk/openjdk8
COPY target/onlinestore-0.0.1-SNAPSHOT.jar /app/application.jar
ENTRYPOINT ["java","-jar","/app/application.jar"]
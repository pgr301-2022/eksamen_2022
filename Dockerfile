FROM adoptopenjdk/openjdk8 as builder

WORKDIR /app
COPY pom.xml
COPY src ./src

RUN mvn package

FROM adoptopenjdk/openjdk8
COPY --from=builder /app/target/*.jar /app/application.jar
ENTRYPOINT ["java","-jar","/app/application.jar"]
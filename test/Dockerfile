#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
WORKDIR /test
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

#
# Package stage
#
FROM openjdk:11-jdk-slim
WORKDIR /test
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]

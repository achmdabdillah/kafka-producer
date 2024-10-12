FROM openjdk:17.0.1-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/myapp.jar myapp.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "myapp.jar"]

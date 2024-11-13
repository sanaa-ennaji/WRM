FROM openjdk:22-jdk-slim

WORKDIR /app


COPY target/WRMG-0.0.1-SNAPSHOT.jar WRMG-0.0.1-SNAPSHOT.jar

EXPOSE 8888


ENTRYPOINT ["java", "-jar", "WRMG-0.0.1-SNAPSHOT.jar"]

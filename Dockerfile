FROM openjdk:17-jdk-slim
COPY build/libs/GetMessage-0.0.1-SNAPSHOT.jar /app/GetMessage.jar
WORKDIR /app
CMD ["java", "-jar", "GetMessage.jar"]

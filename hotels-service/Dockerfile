FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/hotels-service-0.0.1.jar
COPY ${JAR_FILE} app_hotel.jar
ENTRYPOINT ["java", "-jar", "app_hotel.jar"]
RUN apt-get update && apt-get install -y netcat
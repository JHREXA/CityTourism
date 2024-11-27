FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/restaurant-service-0.0.1.jar
COPY ${JAR_FILE} app_restaurant.jar
ENTRYPOINT ["java", "-jar", "app_restaurant.jar"]
RUN apt-get update && apt-get install -y netcat
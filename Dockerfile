FROM openjdk:8-jdk-slim
COPY build/libs/ .
RUN apt-get update && apt-get upgrade -y
EXPOSE 8080
CMD ["java", "-jar", "geometric-calculator-0.0.1.jar"]


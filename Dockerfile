# Use a base image with Java and a minimal Linux distribution
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file of your Spring Boot application into the container
COPY target/practicacontenedor-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application listens on (e.g., 8080)
EXPOSE 8080

# Command to run the application when the container starts
CMD ["java", "-jar", "app.jar"]

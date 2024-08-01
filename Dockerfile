FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's jar file to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Expose the port that your application will run on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/demo.jar"]
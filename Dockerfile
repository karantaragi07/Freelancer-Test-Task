# Use official OpenJDK image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven build output
COPY target/*.jar app.jar

# Expose port used by Spring Boot
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

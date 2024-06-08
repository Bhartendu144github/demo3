FROM openjdk:17-jdk-slim
# Add a volume pointing to /tmp
VOLUME /tmp
# Copy the application's jar to the container
COPY target/demo3-0.0.1-SNAPSHOT.jar app.jar
# Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
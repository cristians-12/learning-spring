# ---- STAGE 1: Build with Maven ----
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn -q dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# ---- STAGE 2: Run the application ----
FROM eclipse-temurin:17-jdk
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENV PORT=8080
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

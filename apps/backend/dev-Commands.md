# VS Code + Maven + Spring Boot Commands

## Compile the Application
mvn clean compile

## Install the updated dependency (Skip Tests)
mvn clean install -DskipTests

## Run the application
mvn spring-boot:run

## Run application with specific profile
mvn spring-boot:run -Dspring-boot.run.profiles=dev

## Package the application (JAR / WAR)
mvn clean package

## Run tests only
mvn test


## Clean target directory
mvn clean

## Force update dependencies
mvn clean install -U

## Check dependency tree
mvn dependency:tree

## Maven help command
mvn help:describe -Dcmd=compile

## VS Code Shortcuts
- Open Terminal: Ctrl + `
- Command Palette: Ctrl + Shift + P
- Reload Window: Ctrl + Shift + P → Reload Window

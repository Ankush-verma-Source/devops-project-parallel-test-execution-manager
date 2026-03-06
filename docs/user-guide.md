# User Guide

## Project Title
Parallel Test Execution Manager using Jenkins and Docker Selenium Grid

---

# 1. Introduction

This guide explains how to set up and run the project.

The project automates Selenium testing using Jenkins and Docker Selenium Grid.

---

# 2. Prerequisites

Before running the project ensure the following software is installed:

- Java JDK 17+
- Maven
- Docker Desktop
- Git
- Jenkins

---

# 3. Clone the Repository

Run the following command:

git clone https://github.com/Ankush-verma-Source/devops-project-parallel-test-execution-manager.git

Then move into the project directory:

cd devops-project-parallel-test-execution-manager

---

# 4. Start Selenium Grid

Run the following command:

docker compose -f infrastructure/docker/docker-compose.yml up -d

This will start the following containers:

- Selenium Hub
- Chrome Node
- Test Runner

---

# 5. Run Selenium Tests

Execute the following command:

mvn clean test

This will execute the Selenium tests using the TestNG framework.

---

# 6. Run Jenkins Pipeline

Open Jenkins:

http://localhost:8080

Steps:

1. Open the pipeline job
2. Click **Build Now**
3. Jenkins will start the pipeline stages

Pipeline stages include:

- Start Selenium Grid
- Run Tests
- Stop Selenium Grid

---

# 7. View Test Results

After pipeline execution:

Jenkins → Build → Test Results

You can view:

- Passed tests
- Failed tests
- Test history trend

---

# 8. Stop Selenium Grid

To stop the containers run:

docker compose -f infrastructure/docker/docker-compose.yml down

---

# 9. Troubleshooting

### Docker Containers Not Running

Run:

docker compose down  
docker compose up -d

---

### Selenium Grid Not Accessible

Open:

http://localhost:4444

Check if browser nodes are connected.

---

### Maven Build Error

Run:

mvn clean install
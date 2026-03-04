# Parallel Test Execution Manager (DevOps Project)

**Student Name:** Ankush Verma  
**Course:** CSE3253 – DevOps  
**Semester:** VI (2025-2026)  
**Project Type:** CI/CD Automation with Parallel Selenium Test Execution  

Repository:  
https://github.com/Ankush-verma-Source/devops-project-parallel-test-execution-manager

---

# 1. Project Overview

## Problem Statement

Manual testing and sequential test execution slow down software delivery pipelines. When many automated tests run one by one, the total testing time becomes very large.

This project solves the problem by creating a **Parallel Test Execution Manager** using:

- Selenium Grid
- Docker containers
- Jenkins CI pipeline
- Maven automation

The system executes **multiple Selenium tests simultaneously in parallel containers**, significantly reducing test execution time.

---

# 2. Objectives

The objectives of this project are:

- Implement CI/CD pipeline using Jenkins
- Automate test execution using Maven
- Run Selenium tests in parallel
- Use Docker containers for Selenium Grid
- Integrate Jenkins + Docker + Selenium
- Generate automated test reports

---

# 3. Key Features

- Parallel Selenium test execution
- Automated CI/CD pipeline
- Dockerized Selenium Grid
- Headless browser testing
- Automatic test reporting
- Multi-stage Jenkins pipeline
- Scalable testing infrastructure

---

# 4. System Architecture

```
Developer → GitHub → Jenkins Pipeline → Docker Selenium Grid → Parallel Test Execution → Test Reports
```

---

# 5. Technology Stack

## Programming

- Java 17
- Maven
- Selenium WebDriver
- TestNG

## DevOps Tools

| Tool | Purpose |
|-----|------|
| Git | Version control |
| GitHub | Code repository |
| Jenkins | CI/CD automation |
| Docker | Containerization |
| Docker Compose | Multi-container setup |
| Selenium Grid | Parallel browser execution |

---

# 6. Project Structure

```
devops-project-parallel-test-execution-manager
│
├── src
│   ├── main/java/utils
│   │       DriverFactory.java
│   │
│   └── test/java/tests
│           LoginTest.java
│           SearchTest.java
│           CheckoutTest.java
│
├── infrastructure
│   └── docker
│        docker-compose.yml
│
├── pipelines
│       Jenkinsfile
│
├── pom.xml
└── README.md
```

---

# 7. Prerequisites

Make sure the following tools are installed:

| Tool | Version |
|-----|------|
| Java | 17+ |
| Maven | 3.8+ |
| Docker Desktop | Latest |
| Git | Latest |
| Jenkins | 2.x |

---

# 8. Installation

## Clone Repository

```bash
git clone https://github.com/Ankush-verma-Source/devops-project-parallel-test-execution-manager.git

cd devops-project-parallel-test-execution-manager
```

---

# 9. Running the Project

## Run Using Jenkins (Recommended)

### Open Jenkins

```
http://localhost:8080
```

### Create Pipeline

Pipeline Name:

```
parallel-test-execution-manager-pipeline
```

### Configure Repository

Repository URL:

```
https://github.com/Ankush-verma-Source/devops-project-parallel-test-execution-manager.git
```

Branch:

```
main
```

Script Path:

```
pipelines/Jenkinsfile
```

---

# 10. Jenkins Pipeline

The Jenkins pipeline performs three stages.

## Stage 1 — Start Selenium Grid

```bash
docker compose -f infrastructure/docker/docker-compose.yml up -d
```

This starts:

- Selenium Hub
- Chrome Node
- Test Runner container

---

## Stage 2 — Run Tests

```bash
mvn clean test
```

Runs Selenium tests in parallel using TestNG.

---

## Stage 3 — Stop Selenium Grid

```bash
docker compose -f infrastructure/docker/docker-compose.yml down
```

Stops and removes all containers.

---

# 11. Jenkinsfile

```groovy
pipeline {
    agent any

    stages {

        stage('Start Selenium Grid') {
            steps {
                bat 'docker compose -f infrastructure/docker/docker-compose.yml up -d'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Stop Selenium Grid') {
            steps {
                bat 'docker compose -f infrastructure/docker/docker-compose.yml down'
            }
        }

    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
```

---

# 12. Selenium Driver Factory

The DriverFactory class creates a RemoteWebDriver connected to Selenium Grid.

```java
driver = new RemoteWebDriver(
    new URL("http://selenium-hub:4444/wd/hub"),
    options
);
```

This allows tests to run inside Docker Selenium containers.

---

# 13. Running Tests from Terminal

You can also run tests manually.

### Start Selenium Grid

```bash
docker compose -f infrastructure/docker/docker-compose.yml up -d
```

### Run Tests

```bash
mvn clean test
```

### Stop Selenium Grid

```bash
docker compose -f infrastructure/docker/docker-compose.yml down
```

---

# 14. Test Reports

Reports are automatically generated in:

```
target/surefire-reports
```

Example files:

```
TEST-tests.SearchTest.xml
TEST-tests.CheckoutTest.xml
```

These reports are displayed inside **Jenkins Test Results UI**.

---

# 15. Example Jenkins Output

```
Running Search Test on Thread: TestNG-test-Parallel Tests-1
Running Checkout Test on Thread: TestNG-test-Parallel Tests-2
```

This confirms **parallel execution is working**.

---

# 16. Project Achievements

This project demonstrates:

✔ CI/CD pipeline implementation  
✔ Selenium parallel test execution  
✔ Docker container orchestration  
✔ Jenkins automation pipeline  
✔ Automated test reporting

---

# 17. Challenges Faced

| Challenge | Solution |
|--------|--------|
| Selenium Grid connection failure | Fixed driver URL |
| Jenkins branch mismatch | Updated branch to main |
| DriverFactory method error | Added quitDriver() |
| Docker compose path issues | Corrected compose file path |

---

# 18. Future Improvements

Possible improvements:

- Add Firefox and Edge browser nodes
- Add Kubernetes deployment
- Integrate Allure reporting
- Add GitHub Actions pipeline
- Add test coverage reports

---

# 19. Conclusion

The **Parallel Test Execution Manager** demonstrates how DevOps tools automate testing pipelines and improve software delivery speed.

Using Jenkins, Docker, and Selenium Grid enables scalable and faster test execution.

---

# Demo Script

## Project Title
Parallel Test Execution Manager using Jenkins and Docker Selenium Grid

Student: Ankush Verma  
Course: DevOps (CSE3253)

---

# 1. Introduction

Good morning/afternoon.

Today I will demonstrate my DevOps project titled **Parallel Test Execution Manager using Jenkins and Docker Selenium Grid**.

This project focuses on automating Selenium test execution using a CI/CD pipeline.

---

# 2. Problem Statement

Traditional Selenium testing runs tests sequentially which increases testing time.

This project solves the problem by enabling **parallel execution of Selenium tests using Docker Selenium Grid and Jenkins automation**.

---

# 3. Technologies Used

The technologies used in this project include:

- Java
- Selenium WebDriver
- TestNG
- Maven
- Docker
- Selenium Grid
- Jenkins
- GitHub

---

# 4. System Architecture

The architecture of the system is:

GitHub Repository  
↓  
Jenkins Pipeline  
↓  
Docker Selenium Grid  
↓  
Parallel Selenium Tests  
↓  
JUnit Test Reports  

---

# 5. Project Structure

The project contains:

- Source code in src directory
- Docker configuration
- Jenkins pipeline configuration
- Selenium automation tests

---

# 6. Demonstration

### Step 1: Show GitHub Repository

Open the project repository and explain the folder structure.

---

### Step 2: Open Jenkins Dashboard

Open Jenkins and show the pipeline job created for the project.

---

### Step 3: Run Jenkins Pipeline

Click **Build Now**.

The pipeline performs the following stages:

1. Start Selenium Grid
2. Run Selenium Tests
3. Stop Selenium Grid

---

### Step 4: Show Test Execution

Open the console output.

Show the following output:

Running Search Test on Thread  
Running Checkout Test on Thread  

This demonstrates parallel test execution.

---

### Step 5: Show Test Results

Open Jenkins Test Results and show the passed tests.

---

### Step 6: Show Docker Containers

Run the command:

docker ps

This shows running containers:

- selenium-hub
- chrome
- test-runner

---

### Step 7: Show Selenium Grid UI

Open:

http://localhost:4444

Show the connected browser node.

---

# 7. Benefits of the Project

- Faster test execution
- Automated CI/CD pipeline
- Scalable testing infrastructure
- Reduced manual testing effort

---

# 8. Conclusion

This project successfully demonstrates how DevOps tools can automate software testing and improve development efficiency.

Thank you.
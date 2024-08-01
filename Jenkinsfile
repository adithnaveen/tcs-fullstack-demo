pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from GitHub
                git 'https://github.com/adithnaveen/tcs-fullstack-demo.git'
            }
        }
        
        stage('Clean') {
            steps {
                // Clean the project
                sh './mvnw clean'
            }
        }
        
        stage('Compile') {
            steps {
                // Compile the project
                sh './mvnw compile'
            }
        }
        
        stage('Package') {
            steps {
                // Package the project as a JAR file
                sh './mvnw package'
            }
        }
        
        stage('Run') {
            steps {
                // Run the Spring Boot application
                sh 'java -jar target/demo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
    
    post {
        always {
            // Clean up workspace or perform any necessary actions after the pipeline
            cleanWs()
        }
    }
}
pipeline {
    agent any

    tools {
        maven 'Maven-3.9.9' // ✅ Must match the name in Jenkins
        jdk 'JDK-21'        // ✅ Must match the name in Jenkins
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                bat 'echo Deploying application...'
                // ❗ Comment out the below line unless /path/to/deploy/ exists on Windows
                // bat 'copy target\\basic-java-app-1.0-SNAPSHOT.jar C:\\deploy\\'
            }
        }
    }

    post {
        always {
            bat 'echo Cleaning up...'
        }

        success {
            echo 'Build succeeded!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}

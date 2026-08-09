pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Code checked out from GitHub'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

    }
}
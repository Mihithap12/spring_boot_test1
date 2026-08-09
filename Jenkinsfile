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


        stage('Docker Build') {
    steps {
        bat 'docker build -t mihitha12/student-lms:latest .'
    }
}

stage('Docker Push') {
    steps {
        withCredentials([
            usernamePassword(
                credentialsId: 'dockerhub-creds',
                usernameVariable: 'DOCKER_USERNAME',
                passwordVariable: 'DOCKER_PASSWORD'
            )
        ]) {
            bat 'docker login -u %DOCKER_USERNAME% -p %DOCKER_PASSWORD%'
            bat 'docker push mihitha12/student-lms:latest'
        }
    }
}

    }
}
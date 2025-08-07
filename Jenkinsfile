pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Cloning repository...'
            }
        }
        stage('Build') {
            steps {
                echo 'Compiling source code...'
                bat 'mkdir build 2>nul'
                bat 'javac -d build MyApp.java MyAppTest.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'java -cp build MyAppTest'
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}

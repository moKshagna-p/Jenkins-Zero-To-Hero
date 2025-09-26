pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the application...'
                // if you are building any javascript applications
                // all the build commands and install dependencies commands will go here
                //sh 'npm install'
                //sh 'npm build'
        }
        stage('Test') {
            steps {
                echo 'Testing the application...'
                // for examples testing java backend
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
            }
        }
    }
}
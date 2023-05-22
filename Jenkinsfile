pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
        stage("Setup") {
            sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            '''
        }
        stage('Build') {
            steps {
                sh 'mvn build'
            }
        }

        stage('Test') {
          steps {
            sh 'mvn test'
          }
        }

        stage ('Publish to nexus') {
          steps {
             echo "I'm publishing to nexus now"
          }
        }
    }
}
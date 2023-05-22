pipeline {
    agent any
    stages {
        stage("Setup") {
          steps {
            sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
            '''
          }
        }
        stage('Build') {
            steps {
            withMaven{
                sh 'mvn build'
            }
            }
        }

        stage('Test') {
          steps {
            withMaven{
                sh 'mvn test'
            }
          }
        }

        stage ('Publish to nexus') {
          steps {
             echo "I'm publishing to nexus now"
          }
        }
    }
}
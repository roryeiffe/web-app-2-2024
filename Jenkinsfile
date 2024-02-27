pipeline {
    agent { 
        docker { 
            image 'maven:3.9.6-eclipse-temurin-17-alpine'
            serverUrl 'tcp://127.0.0.1:2375'
        } 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Post-Build') {
          steps {
            archiveArtifacts 'target/demo-0.0.1-SNAPSHOT.jar'
          }
        }
    }
}

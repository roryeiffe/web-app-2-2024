pipeline {
   agent {
    docker {
      image 'maven:3.9.6-eclipse-temurin-17-alpine'
       dns ['8.8.8.8', '8.8.4.4']
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

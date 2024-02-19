pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        docker {
          image 'maven:3.9.6-eclipse-temurin-17-alpine'
          args 'mvn package'
        }
      }
    }
  }
}
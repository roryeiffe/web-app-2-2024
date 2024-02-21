pipeline {
    agent { docker { image 'maven:3.9.6-eclipse-temurin-17-alpine' } }
    triggers {
      githubPush {
        branches "master"
        // Additional filtering like file paths or commit messages can be added here
      }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
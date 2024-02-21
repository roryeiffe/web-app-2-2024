pipeline {
    agent any // This allows any available Jenkins agent to run the job

    stages {
        stage('Build') {
            steps {
                sh 'mvn package' // Assuming you have Maven installed on the agent
            }
        }
        stage('Post-Build') {
            steps {
                archiveArtifacts 'target/demo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
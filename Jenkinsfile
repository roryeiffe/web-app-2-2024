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
                // Assuming the generated artifact is in target/hello-world.jar
                archiveArtifacts 'target/demo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
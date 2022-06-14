def call(Sring repoUrl){
    pipeline {
        agent any
        tools {
            maven 'maven'
        }
        stages {
            stage("to-test-maven"){
                steps {
                    sh 'mvn -v'
                }
            }
        }
    }
}
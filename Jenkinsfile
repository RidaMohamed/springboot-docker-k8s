pipeline {
    agent any
    tools{
        maven 'maven 3.8.5'
    }
    stages('Build Maven'){
        steps{
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '2905567b-de03-4961-9266-12a3b81709d7', url: 'https://github.com/RidaMohamed/springboot-docker-k8s.git']])
            sh 'mvn clean install'
        }
    }

}
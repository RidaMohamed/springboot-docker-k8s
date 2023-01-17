pipeline {
    agent any
    tools{
        maven 'maven 3.8.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '2905567b-de03-4961-9266-12a3b81709d7', url: 'https://github.com/RidaMohamed/springboot-docker-k8s.git']])
                sh 'mvn clean install'
            }
        }
    }
    stage('Build docker image'){
        steps{
            script{
                sh 'docker build -t mohamedridh/django-h .'
            }
        }
    }
    stage('Push docker image'){
        steps{
            script{
                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerHubpwd')]) {
                    sh 'docker login -u mohamedridh -p ${dockerHubpwd}'
                    sh 'docker push mohamedridh/django-h '
                }
            }
        }
    }
}
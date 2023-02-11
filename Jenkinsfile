pipeline {
    agent any
    tools {
        maven 'maven_3.6.3'
    }
    stages {
        stage('Build a Maven Project '){
            steps{ 
                echo 'Start The checking of github repository'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Tcarters/SpringBootApp_and_DevOps']])
                echo 'Cleaning the Project'
                sh 'mvn clean install'
            }
        }
        stage ('Build SpringApp Docker Image ') {
            steps{
                script {
                    echo 'Checking if docker service is available ...'
                    sh 'systemctl is-active --quiet docker && echo "Service is running ..."'
                    echo 'Starting Docker Image building'
                    sh 'docker build -t tcdocker2021/springbt-in-docker:latest .'
                }
            }
        }
        stage ('Pushing the SpringApp Docker Image to Docker Registry') {
            steps {
                script {
                    echo 'Logging to Docker registry.....'
                    withCredentials([string(credentialsId: 'mytcdocker-hub', variable: 'mydockerhubpwd')]) {
                        sh 'docker login -u tcdocker2021 -p ${mydockerhubpwd}'    // some block
                    }
                    echo 'Starting the push of Docker Image ....'
                    sh ' docker push tcdocker2021/springbt-in-docker:latest '
                }
            }
        }
        stage ('Testing the deployment') {
            steps {
                script {
                    echo 'Starting a local container of the App ....'
                    sh 'docker run -dit --name springapp -p 2000:8080 tcdocker2021/springbt-in-docker:latest '
                    echo 'The App is now available at Port 2000 ....'
                }
            }
        }
    }
}
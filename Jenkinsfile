pipeline {
    agent any

    environment {
        MAVEN_HOME = '/opt/maven'
        SONARQUBE_ENV = 'SonarQube'
    }

    tools {
        maven 'Maven 3.8.7'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:prepare-agent test jacoco:report'
            }
            post {
                always {
                    publishHTML([reportDir: 'target/site/jacoco', reportFiles: 'index.html', reportName: 'Code Coverage'])
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv(SONARQUBE_ENV) {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
}
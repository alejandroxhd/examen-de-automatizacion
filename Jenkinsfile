pipeline {
    agent any

    tools {
        // Los nombres 'MAVEN3' y 'JDK17' deben existir en la configuración global de Jenkins
        maven 'MAVEN3'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // En Windows, cambiar 'sh' por 'bat' y el comando por 'mvn ...'
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn -B test'
            }
        }

        stage('Integration Tests') {
            steps {
                // Ejecuta solo las pruebas de integración (maven-failsafe-plugin)
                sh 'mvn -B failsafe:integration-test failsafe:verify'
            }
        }
    }

    post {
        success {
            // Publica los reportes JUnit en Jenkins
            junit 'target/surefire-reports/*.xml'
            junit 'target/failsafe-reports/*.xml'
        }
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}

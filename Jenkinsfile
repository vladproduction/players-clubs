pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    bat 'dir'
                    checkout([$class: 'GitSCM', 
                        branches: [[name: '*/main']], 
                        userRemoteConfigs: [[url: 'https://github.com/vladproduction/players-clubs']]
                    ])
                    bat 'dir'
                }
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvnw.cmd package' 
            }
        }
        
        // Adding a stage for parallel execution of tests
        stage('Run Tests') {
            parallel failFast: true, {
                stage('testsA') {
                    steps {
                        script {
                            echo "Running testsA"
                            sleep 1 // Combined total sleep time for this stage
                        }
                    }
                }

                stage('testsB') {
                    steps {
                        script {
                            echo "Running testsB"
                            sleep 1 
                        }
                    }
                }
                
                stage('testsC') {
                    steps {
                        script {
                            echo "Running testsC"
                            sleep 1 
                            //error("Simulated failure in testsC") // This line causes the failure
                        }
                    }
                }
            }
        }

        stage('Capture') {
            steps {
                archiveArtifacts '**/target/*.jar'
                jacoco()
                junit '**/target/surefire-reports/TEST*.xml'
            }
        }
    }

    // Separate stage for sending email notification
    post {
        always {
            script {
                emailext(
                    body: "${env.BUILD_URL}\n${currentBuild.absoluteUrl}",
                    to: 'always@foo.bar',
                    recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'CulpritsRecipientProvider']],
                    subject: "${currentBuild.currentResult}: Job ${env.JOB_NAME} [${env.BUILD_NUMBER}]"
                )
            }
        }
    }
}


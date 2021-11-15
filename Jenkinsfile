pipeline {
    agent any
  stages {
    stage('Angular CLI'){
      steps {
        sh 'npm config ls'
        
      }
    }
    stage('Install'){
      steps{
        sh 'npm install'
        echo ("NPM installing")
      }
    }
    stage('Run'){
      steps{
        sh 'npm run'
        echo ('Running the application')
      }
    }
    stage ('Test') {
      steps {
        sh 'npm test'
        echo ('Testing the application')
      }
    }
  }
}
  

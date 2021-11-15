pipeline {
    agent any
  stages {
    /*stage('Angular CLI'){
      steps {
        sh 'npm install -g @angular/cli'
        echo ("Angular CLI is installed")
      }
    }*/
    stage('Install'){
      steps{
        sh 'npm install'
        echo ("NPM installing")
      }
    }
    stage('Run'){
      steps{
        sh 'npm run'
      }
    }
    stage ('Test') {
      steps {
        sh 'npm test'
      }
    }
  }
}
  

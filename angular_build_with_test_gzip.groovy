timeout(5) {
  node("master") {
    stage("Code Check Out") {
      git branch: 'main', credentialsId: env.Credential_ID, url: 'https://github.com/balishaidashaik/Angularjs-repo.git'
      echo("${GIT_URL} Repository was successfully cloned.")
    }
	
    stage("Build Node Modules") {
      nodejs('Node') {
      sh 'npm install'
    }
      echo("Node Modules installed successully")
    }
	  
    stage("Test the AngularJs Application") {
      nodejs('Node') {
      sh 'npm test'
    }
      echo("AngularJs Application is Built Successfully")
    }	 
	
    stage("Build/Package the AngularJs Application") {
      nodejs('Node') {
      sh 'npm run build'
    }
      echo("AngularJs Application is Built Successfully")
    }

 
    stage("Gzip the Angular Build") {
      sh("gzip -r ./build")
      echo("AngularJs Application is Built & Compressed Successfully")
    }
    
  }
}

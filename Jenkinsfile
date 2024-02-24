pipeline {

	agent any
	
	options {
		timestamps()
		// skipDefaultCheckout()
		timeout(time: 60, unit: 'MINUTES')
		buildDiscarder(logRotator(numToKeepStr:'10'))
	}
    
	stages{
	
		stage('Hello') {
			steps {
				echo "Hello Hamid"
			}
		}
		
		stage('run this with specific branch') {
			when {
				branch "feature/*"
			}
			steps {
				echo "only for feature branch"
			}
		}
		
		stage('Build') {
			steps {
				sh 'mvn clean install'
			}
		}
		
		stage('Test') {
			steps {
				sh 'mvn test'
			}
			post {
				always {
					junit 'target/surefire-reports/*.xml'
				}
			}
		}
	}
}


pipeline {

	agent any
    
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
	}
}


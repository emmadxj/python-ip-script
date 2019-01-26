job ('assignment2') {
    triggers{
    	configure {
    		it / 'triggers' << 'com.cloudbees.jenkins.GitHubPushTrigger' {
    		 spec ''}
    	}
    	scm ('')

    }
    
    scm {
           git ('git://github.com/emmadxj/python-ip-script')
    }

    
    configure { node ->
        node / builders / 'hudson.plugins.python.Python' / command << readFileFromWorkspace('./main.py')
    }
 
}
 


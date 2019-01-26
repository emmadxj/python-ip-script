job ('assignment2') {
 
    scm {
           git ('git://github.com/emmadxj/python-ip-script')
    }


    }
    configure { node ->
        node / builders / 'hudson.plugins.python.Python' / command << readFileFromWorkspace('./main.py')
    }
 
}
 


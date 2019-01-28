python-ip-script
=================

# Background
This is for assignment 2. Jenkins job to execute the python script in this repo.
The Jenkins Job DSL is defined in the job groovy.

# Requriements
As one of the requirement, the job should be triggered from this repo as well. Therefore, there is additional setting in both Jenkins and Github side.

Jenkins:
----------
GitHub Integration Plugin need to be installed in Jenkins.

Github access is allowed by setup in Manage Jenkins --> Manage Tools configuration.

http://172.20.10.4:8080/ is the ip of my local jenkins instance.


Github:
-------
Setup the GitHub Webhook, with which the jenkins job will be triggered on a Push event.


# Test Run
Refer to below console output. When a test file is commited, a jenkins job is auto triggered.
~~~
Console Output
Started by user Emma Dai
[EnvInject] - Loading node environment variables.
Building on master in workspace /var/lib/jenkins/workspace/Assignment2
 > git rev-parse --is-inside-work-tree # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url git://github.com/emmadxj/python-ip-script # timeout=10
Fetching upstream changes from git://github.com/emmadxj/python-ip-script
 > git --version # timeout=10
 > git fetch --tags --progress git://github.com/emmadxj/python-ip-script +refs/heads/*:refs/remotes/origin/*
Seen branch in repository origin/master
Seen 1 remote branch
 > git show-ref --tags -d # timeout=10
Checking out Revision 7fb23fbdb12ce682e7e7b9bdf117cdd47de78352 (origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 7fb23fbdb12ce682e7e7b9bdf117cdd47de78352
Commit message: "test"
 > git rev-list --no-walk 7172c2c09ca1c23c2213d5b1088109114041d6b9 # timeout=10
 > git tag -a -f -m Jenkins Build #32 jenkins-Assignment2-32 # timeout=10
Processing provided DSL script
Existing items:
    GeneratedJob{name='assignment2'}
Finished: SUCCESS
© 2019 GitHub, Inc.
~~~

# Alternatively,
This task can also be done via jenkins pipline. Instead Jenkins Job/Step, we could diffine several stage in the pipline groovy, which could be
-- git clone repo
-- execute python script
While, pipline is more used in complicated tasks which involve multiple stagse and each of the status/output of each stage may have impact on the consequence stage. Pipeline could give better exception handing, log trackin and notification.

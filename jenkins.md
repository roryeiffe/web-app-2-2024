## Jenkins

Jenkins is an open source automation server which enables developers around the world to reliably build, test, and deploy their software.

It is similar to Github Actions in that both tools provide a way to automate the software development process. Jenkins is a bit more complex and has a steeper learning curve, but it is also more powerful and flexible.

Jenkins is self-contained, open source automation server. Jenkins can be installed through native system packages, Docker, or even run standalone by any machine with a Java Runtime Environment (JRE) installed.

### Jenkins Pipeline

Jenkins Pipeline (or simply "Pipeline") is a suite of plugins which supports implementing and integrating continuous delivery pipelines into Jenkins.

A continuous delivery pipeline is an automated expression of your process for getting software from version control right through to your users and customers.

Jenkins Pipeline provides an extensible set of tools for modeling simple-to-complex delivery pipelines "as code". The definition of a Jenkins Pipeline is typically written into a text file (called a Jenkinsfile) which in turn is checked into a project’s source control repository.

### Jenkinsfile

A Jenkinsfile is a text file that contains the definition of a Jenkins Pipeline and is checked into source control. Consider a Jenkinsfile to be the source code for the pipeline.

### Master and Agent

Jenkins has a master-agent architecture, where the master is responsible for managing and distributing the various development processes across various worker nodes, or agents.

The master serves as the central point of control for all tasks and workflows and provides a web interface for managing the Jenkins system.

The agents are the worker nodes which are responsible for executing the build jobs dispatched by the master. It works as a distributed system, so it is good for scaling. 
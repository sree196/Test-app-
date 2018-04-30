For documentation refer swagger UI 
http://localhost:8080/gannettapp/swagger-ui.html#!



This repo has a simple web application with unit tests and code coverage tests included in it.

Instructions to run the app with mvn: go to repo directory:

Run the below commands:

mvn install

This will run the build, unit tests to the project. You can check the code results by opening target/

"java -jar target/gannettApp-1.0-SNAPSHOT.jar" > /opt/gannettapp
This will run the application. you can go to the browser and enter the url: http:///

How To Run Application With Docker Container:
#docker pull sree196/hellocontainerimage
#docker run -p 8080:8080 sree196/hellocontainerimage
After you run the above command, the application will run and ready to listen to your requests.

Instructions on How To Test Docker image created from this Dockerfile

Install dgoss and goss to test the container. (Instructions for installing dgoss and goss: https://github.com/aelsabbahy/goss/tree/master/extras/dgoss)
After installing dgoss, run the following command in the same directory where goss.yaml exists.

dgoss run -p 8080:8080   sree196/hellocontainerimage

This will test the container based on the tests cases given in goss.yaml

To Run Concourse CI Pipeline :

Clone the repo: git clone https://github.com/sree196/Test-app-/tree/master/gannettApp
Running the pipeline: fly -t lite set-pipeline -c pipeline.yml -p web-app

This will create a pipeline with name web-app and once you run this will build and test the web application and then run integration test with dgoss.

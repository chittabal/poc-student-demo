# poc-student-demo
studentdemo

#1 Steps to setup application

* Download and install git bash

* Open git bash and clone the app

git clone https://github.com/ranjanbal139/poc-student-management.git

* Go inside of app
cd poc-student-management

* Remove .class and .project files of app

mvn eclipse:clean eclipse:eclipse

* Compile and build app

mvn -e clean install -DskipTests=true

* Run

mvn spring-boot:run


#2. Provide a API to check health of the application

http://localhost:8080/health/status


#3. Once app is up and running , student is available by base link

http://localhost:8080/student

#4. Provides a link called 'View' to see all registered students in tabular format.

http://localhost:8080/student/view

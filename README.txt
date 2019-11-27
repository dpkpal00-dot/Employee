#Employee Management System

#HOW TO RUN THIS PROJECT?#
###FROM THE IDE:###
1. Open the project in an IDE like Eclipse.
2. You can run the DBScript provided in MySQL to create database and tables with basic values. 
	(Creating database is necessary since hibernate- update option is used : "spring.jpa.hibernate.ddl-auto = update")
3. In case you do not want to run file, you can change the line "spring.jpa.hibernate.ddl-auto = update"  to  "spring.jpa.hibernate.ddl-auto = create-drop"
	in src/main/resources/application.properties file.
4. Check your database connection in src/main/resources/application.properties file and change if needed.
5. Go to com.employee.management
6. Right Click on class Application.
7. Hit "Run As Java Application" in the IDE.
8. Check if localhost server has started.
9. Open Postman client service on Google chrome.
10. Hit url : "http://localhost:8080/employees" 
11. Accordingly select the request method and the url as follows:

	Employee: 
		GET - "http://localhost:8080/employees" - gets list of all employees
		POST - "http://localhost:8080/employees" - inserts into employees
		

#ASSUMPTIONS#
1. DATABASE and TABLES are created in MySQL
3. Make sure department table is populated with the department you refer for in employee.
4. While inserting employee detail through postman service: give a department id for department. 
	Eg: {
			"employeeID": 2,
			"firstName": "Tim",
			"lastName": "Cook",
			"department": "Technical",
                          "dob":1994-12-15
		} 
    

#TECHNOLOGY STACK#
1. Java
2. Eclipse Neon 4.6.0
3. MySQL Workbench
4. Postman for Chrome: Version 4.10.5


#DESIGN DISCUSSION#
1. Get mapping will fetch the results, Post mapping will insert results
2. You will need to create database if not, change in the application.properties file.



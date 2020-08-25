# acko-back-end project
 This project is developed using the Java, Springboot , JPA and Postgres Database
# Setup project
add the postgres database connection details on file application.properties in resources folder

# open the project in editor like Intellij as maven project
# Run maven commad 
mvn spring-boot:run 

## Above step will create the table in database and create dummy entry for mobile number 123456789

# end point  to be used
http://localhost:8080/customer/history/123456789 is available to access the history of customer

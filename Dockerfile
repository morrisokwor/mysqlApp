FROM openjdk:11
EXPOSE 8080
ADD target/mysqlApp.jar mysqlApp.jar
ENTRYPOINT ["java","-jar","/mysqlApp.jar"]

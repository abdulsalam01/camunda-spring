# jdk 11
FROM openjdk:11
# set working directory
WORKDIR /camunda-spring
# copy all source
COPY . /camunda-spring
# define jar file
ARG JAR_FILE=target/camunda-java-spring-1.0-SNAPSHOT.jar
# alias as app.jar
ADD ${JAR_FILE} app.jar
# run the jar
ENTRYPOINT ["java","-jar","/app.jar"]
#Dockerfile,
FROM openjdk:21
RUN mkdir /usr/app/ 
COPY target/Coding-Quest.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT [ "java","-jar","Coding-Quest.jar" ]
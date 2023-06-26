From tomcat:9.0.48-jdk11-openjdk-slim
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/demo-web-app-1.war /usr/local/tomcat/webapps/demo-web-app-1.war
CMD ["catalina.sh","run"]

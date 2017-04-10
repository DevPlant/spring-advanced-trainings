FROM java:8-jre
VOLUME /tmp

ADD spring-cloud-basics-backend-hello.jar /app/

CMD ["java", "-Xmx750m", "-jar", "-Dspring.profiles.active=prod", "/app/spring-cloud-basics-backend-hello.jar"]

EXPOSE 7070
FROM java:8-jre

VOLUME /tmp

ADD spring-cloud-gateway.jar /app/

CMD ["java", "-Xmx500m", "-jar","-Dspring.profiles.active=prod", "/app/spring-cloud-gateway.jar"]

EXPOSE 8080
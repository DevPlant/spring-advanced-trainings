FROM java:8-jre

VOLUME /tmp

ADD spring-cloud-registry.jar /app/

CMD ["java", "-Xmx500m", "-jar","-Dspring.profiles.active=prod", "/app/spring-cloud-registry.jar"]

EXPOSE 8761
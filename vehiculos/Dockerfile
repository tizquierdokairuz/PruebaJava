FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8091
EXPOSE 8080
EXPOSE 3306
ARG JAR_FILE
ADD target/vehiculos.jar demo.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=container", "-jar","/demo.jar"]
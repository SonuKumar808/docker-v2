
FROM openjdk:17
COPY target/spring-docker-app /usr/app
WORKDIR usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-docker-app"]
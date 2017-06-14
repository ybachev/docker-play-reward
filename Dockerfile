FROM java:8
VOLUME /tmp
ADD /target/docker-play-reward-0.0.1-SNAPSHOT.jar play-reward-app.jar
EXPOSE 8080
RUN bash -c 'touch /play-reward-app.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongodb/admin", "-Djava.security.egd=file:/dev/./urandom","-jar","/play-reward-app.jar"]
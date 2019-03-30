FROM java:8
VOLUME /tmp
ADD demo2-0.0.1-SNAPSHOT.jar demo2.jar
RUN bash -c 'touch /demo2.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo2.jar"]
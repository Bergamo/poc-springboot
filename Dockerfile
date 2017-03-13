FROM java:8
VOLUME /tmp
ADD poc-springboot.jar poc-springboot.jar
RUN sh -c 'touch /poc-springboot.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /poc-springboot.jar" ]

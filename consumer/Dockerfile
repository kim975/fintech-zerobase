FROM openjdk:21
EXPOSE 8080
RUN mkdir -p deploy
WORKDIR /deploy
COPY ./build/libs/consumer-0.0.1.jar consumer.jar
ENTRYPOINT ["java", "-jar", "/deploy/consumer.jar"]
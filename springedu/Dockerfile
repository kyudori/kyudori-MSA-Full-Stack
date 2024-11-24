FROM openjdk:17-jdk
VOLUME /uploadtest
ARG JAR_FILE=build/libs/springedu.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java"]
CMD ["-jar","app.jar"]
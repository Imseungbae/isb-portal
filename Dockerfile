FROM openjdk:11
ARG JAR_FILE=/build/libs/isb-portal-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} portal.jar
ENTRYPOINT ["java","-jar","/portal.jar"]
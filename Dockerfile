FROM maven:3.6.0-jdk-13

WORKDIR /usr/src/app

COPY /backend .

RUN mvn compile package

EXPOSE 5000

CMD [ "java", "-jar", "target/samosprava-0.0.1-SNAPSHOT.jar" ]
FROM maven:3.6.0-jdk-13

WORKDIR /usr/src/app

COPY /backend .

RUN mvn compile package

EXPOSE 8080

CMD java -jar -Dserver.port=$PORT target/samosprava-0.0.1-SNAPSHOT.jar
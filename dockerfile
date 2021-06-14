FROM openjdk:latest
ADD /target/ProfileWebService-0.0.1-SNAPSHOT.jar /appdir/
CMD java -jar /appdir/ProfileWebService-0.0.1-SNAPSHOT.jar
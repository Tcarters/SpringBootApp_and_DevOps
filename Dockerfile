# Define base docker Image
FROM openjdk:11
LABEL maintainer=" Tcarters a.k.a @Tdmund_"
ADD target/springbootV3-docker-0.0.1-SNAPSHOT.jar  springbootV3-docker-V0.0.1.jar
EXPOSE 8080 
ENTRYPOINT ["java" , "-jar", "springbootV3-docker-V0.0.1.jar" ]
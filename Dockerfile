### Dockerfile build in the context of Nexus Integration to Jenkins 
FROM maven as build
LABEL maintainer=" Tcarters a.k.a @Tdmund_"
WORKDIR /app 
COPY . .
RUN mvn install 

FROM openjdk:11.0
WORKDIR /app
COPY --from=build /app/target/javaspringapp-v01.jar /app/

EXPOSE 8080
CMD [ "java", "-jar", "javaspringapp-v01.jar" ]




















# # Define base docker Image
# FROM openjdk:11
# LABEL maintainer=" Tcarters a.k.a @Tdmund_"
# ADD target/springbootV3-docker-0.0.1-SNAPSHOT.jar  springbootV3-docker-V0.0.1.jar
# EXPOSE 8080 
# ENTRYPOINT ["java" , "-jar", "springbootV3-docker-V0.0.1.jar" ]
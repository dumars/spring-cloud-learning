FROM blacklabelops/java:ubuntu.server-jre.8.121

MAINTAINER Dumars dumars.tsai@gmail.com

ARG FILE_NAME
ARG ACTIVE_CONFIG

COPY target/${FILE_NAME} /usr/share/eureka.jar

EXPOSE 8761 8762

CMD ["java", "-jar", "-Dspring.profiles.active=${ACTIVE_CONFIG}", "/usr/share/eureka.jar"]
#Dockerfile
FROM openjdk:8-alpine

LABEL maintainer="Assis Junior <assisjrs at gmail.com>"

EXPOSE 8080/tcp

USER root
WORKDIR /opt/gestao-simulado/

COPY build/libs/simulado-api.jar simulado-api.jar

COPY src/docker/start.sh start.sh
RUN chmod +x start.sh

ENTRYPOINT /opt/gestao-simulado/start.sh
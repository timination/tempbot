FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && \
    apk add --no-cache bash git && \
    apk add --no-cache openssh

ARG argToken
ENV TOKEN=$argToken
WORKDIR /
RUN mkdir /src
WORKDIR /src
RUN git clone https://github.com/timination/tempbot.git
WORKDIR /src/tempbot
RUN pwd && ls
RUN bash gradlew shadowJar
WORKDIR /
RUN mkdir /app
RUN cp /src/tempbot/build/libs/TempBot-1.0-SNAPSHOT-all.jar /app/TempBot.jar
RUN rm -r -f /src
CMD java -jar /app/TempBot.jar $TOKEN
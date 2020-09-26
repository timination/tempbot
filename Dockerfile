FROM anapsix/alpine-java:latest
WORKDIR /
ARG argToken
ENV TOKEN=$argToken
ADD /build/libs/TempBot-1.0-SNAPSHOT-all.jar TempBot.jar
CMD java -jar /TempBot.jar $TOKEN

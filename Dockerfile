FROM gcr.io/distroless/java17-debian11

WORKDIR workspace

COPY maven/build/libs/*.jar edge-service.jar

EXPOSE 9000

CMD ["edge-service.jar"]

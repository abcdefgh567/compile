FROM openjdk:17
WORKDIR /app/
COPY *.java ./
RUN javac test.java
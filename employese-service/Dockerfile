FROM openjdk:11-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","./app.jar"]


#FROM openjdk:11-slim  //image임
#ARG JAR_FILE=target/*.jar //변수 = 타겟 위치 jar파일 넣기
#COPY ${JAR_FILE} app.jar // 구동시
#ENTRYPOINT ["java","-jar","./app.jar"]
FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./src ./src

RUN javac -sourcepath ./src -d ./out ./src/ru/gb/jcore/sample/Main.java

RUN java -classpath ./out ru.gb.jcore.sample.Main

RUN javadoc -d docs -sourcepath ./src -cp ./out -subpackages ru




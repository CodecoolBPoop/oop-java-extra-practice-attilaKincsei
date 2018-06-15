#!/bin/sh
javac src/exercises/java/*.java
jar cf java.jar src/exercises/java/*.class
javac -cp java.jar src/exercises/java/Exercise1.java

# path/to/containing/folder$ chmod +x ./compile.sh
# path/to/containing/folder$ ./compile.sh
# cd src/
# java exercises.java.Exercise1

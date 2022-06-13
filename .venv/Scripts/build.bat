@echo off
antlr4 Color.g4 -o java_color
cd java_color
javac *.java
cd ..
antlr4 Color.g4 -o python_color -Dlanguage=Python3

antlr4 Lujvo.g4 -o java_lujvo
cd java_lujvo
javac *.java
cd ..
antlr4 Lujvo.g4 -o python_lujvo -Dlanguage=Python3
:end
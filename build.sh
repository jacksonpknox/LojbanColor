cd grammars
antlr4 -o ../java_color Skaban.g4
antlr4 -o ../package/python_color -Dlanguage=Python3 Skaban.g4
cd ..
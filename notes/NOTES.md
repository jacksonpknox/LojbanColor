## Java
- The tool and runtime are included in the jar
which will be name something like
"antlr-4.10.1-complete.jar"
- the typical place to put the jar is "/usr/local/lib/"
- add the following to .bashrc :
```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.10.1-complete.jar:$CLASSPATH"

alias antlr4='java -jar /usr/local/lib/antlr-4.10.1-complete.jar'

alias grun='java org.antlr.v4.runtime.misc.TestRig'
```
- run these tools like this :
```bash
antlr4 Grammar.g4
javac *.java
grun Grammar $RULE [-gui|-tokens]
```

## Python
- build a python parser from Grammar.g4 like this:

```bash
antlr4 -Dlanguage=Python3 Grammar.g4
```
- [here](https://rich.readthedocs.io/en/stable/appendix/colors.html) are the colors supported by terminals/rich
- try to use just the first 16
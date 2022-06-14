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

## Colors
### brivla
| token | color |
| --- | --- |
| Gismu | #FF0000 | 
| cafourraf | #FF8000 |
| ckfourraf | #FF8000 |
| broraf | #FFC000 |
| balraf | #FFFF00 |
| bauraf | #C0FF00 |

### cmavo
| token | color |
| --- | --- |
| bai | #0000FF |
| by | #0080FF |
| cmavoab, cmavojk, cmavors | #8080FF |
| cmavocd, cmavol, cmavot | #80C0FF |
| cmavof, cmavomn, vy | #C0C0FF |
| cmavogi, cmavop, z | #C0FFFF |
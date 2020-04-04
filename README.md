# COOL_Interpreter
## Compiler's project overview:

This project will direct you to design and build an interpreter for Cool. Each phase will cover one component of the interpreter:    lexical analysis, parsing, and code generation in three address code. Each phase will ultimately result in a working compiler phase which can interface with the other phases.

## Prerequisites
- Worked on [IntelliJ IDEA Community Edition 2019.3.3](https://confluence.jetbrains.com/display/IDEADEV/IDEA+2019.3+latest+builds)
- [java JDK 13.0.1](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html)
- [ANTLRV4 Plug-in Version 4.8](https://plugins.jetbrains.com/plugin/7358-antlr-v4-grammar-plugin)
- Import [antlr-4.8-complete.jar](https://www.antlr.org/download.html) **Notice that jar file is already included on the repository**

## Install
- Install [IntelliJ IDEA Community Edition 2019.3.3](https://treehouse.github.io/installation-guides/windows/intellij-idea-win.html)
- Install [java JDK 13.0.1](https://www.youtube.com/watch?v=jAXmmAr9KzU)
- Install [ANTLRV4 Plug-in Version 4.8 on IntelliJ](https://blog.dgunia.de/2017/10/26/creating-and-testing-an-antlr-parser-with-intellij-idea-or-android-studio/)
- Import [antlr-4.8-complete.jar](https://www.youtube.com/watch?v=rCFMKUtN7rM)
- set gen folder as source root

    -how to set gen folder as source root: 
    ![alt text](https://github.com/Mustafa-Taha/Cool-Lexer/blob/master/testcases/source%20root.png "source root")

#### Now the project is ready to be lunched 😉

## How to run ?
- The Program's Main Class is found in gen folder and it's running from there
- Write the name of the .cl file only, For Example:
For the good test cases write:
```
good
```
For the bad test cases write:
```
bad
```

## Lexical analyzer:
### Introduction :
Lexical analysis is the first phase of a compiler. It takes the modified source code from language preprocessors that are written in the form of sentences. The lexical analyzer breaks these syntaxes into a series of tokens, by removing any whitespace or comments in the source code.
If the lexical analyzer finds a token invalid, it generates an error. The lexical analyzer works closely with the syntax analyzer. It reads character streams from the source code, checks for legal tokens, and passes the data to the syntax analyzer when it demands.

### What the program does :

1) Program takes a single command-line argument (e.g., file.cl). That argument will be an ASCII text Cool source file. and indicate that there is an error in the input (e.g., a malformed string) or emit file.cl-lex, a serialized list of Cool tokens in file called good.cl--lex.

2) Test cases good.cl and bad.cl. The first lex correctly and yield a sequence of tokens. The second contain an error.
    - good.cl contain program that calculate factorial
     good.cl code: 
    ![alt text](https://github.com/Mustafa-Taha/Cool-Lexer/blob/master/testcases/good.cl.png "Input : good.cl code")
    
    - good.cl-lex tokens: 
    ![alt text](https://github.com/Mustafa-Taha/Cool-Lexer/blob/master/testcases/good.cl-lex.png "Output : good.cl-lex")
    - bad.cl is corrupted syntax program contain random symbols
    bad.cl code: 
    ![alt text](https://github.com/Mustafa-Taha/Cool-Lexer/blob/master/testcases/bad.cl.png "Input & Output : bad.cl code")




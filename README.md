# COOL Compiler
## Compiler's project overview:

- This project will direct you to design and build an interpreter for Cool. Each phase will cover one component of the interpreter:    lexical analysis, parsing, and code generation in three address code. Each phase will ultimately result in a working compiler phase which can interface with the other phases.
- **We are working on _The Parser Phase_**

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

### Lexer : What the program does :

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

### Parser
#### Introduction :
Syntax analyzers follow production rules defined by means of context-free grammar. The way the production rules are implemented (derivation) divides parsing into two types : top-down parsing and bottom-up parsing.

*Top-down Parsing* When the parser starts constructing the parse tree from the start symbol and then tries to transform the start symbol to the input, it is called top-down parsing.

- *Recursive descent parsing :* It is a common form of top-down parsing. It is called recursive as it uses recursive procedures to process the input. Recursive descent parsing suffers from backtracking.
- *Backtracking :* It means, if one derivation of a production fails, the syntax analyzer restarts the process using different rules of same production. This technique may process the input string more than once to determine the right production.
- Bottom-up Parsing As the name suggests, bottom-up parsing starts with the input symbols and tries to construct the parse tree up to the start symbol.

- in our code the parsing type is *Top-down Parsing*
### Code Specification:
- A program that takes a single command-line argument (e.g., file.cl-lex). That argument will be an ASCII text Cool tokens file (as described in the lexer programming assignment). The cl-lex file will always be well-formed (i.e., there will be no syntax errors in the cl-lex file itself). f your program is called parser, invoking parser file.cl-lex should yield the same output as cool --parse file.cl. Your program can take another argument which is the file to print the output of the Concrete Syntax Tree (CST) as follows: parser file.cl-lex file.cl-cst. Your program should determine and print any errors in the parsing tree and terminate the program.
- Test cases good.cl and bad.cl. The first should parse correctly and yield an abstract syntax tree. The second should contain an error.
## Contributers:
- Marwan Khaled Zenhom 
- Mostafa Ibrahim Taha 
- Sara Khaled Ahmed 
- Mohamed Hassan Mohamed 
- Rana Ebrahim Mohamed 
- Andrew Anter 

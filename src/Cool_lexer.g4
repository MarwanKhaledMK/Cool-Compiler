lexer grammar Cool_lexer;
//******************** 1. ALL ENGLISH LETTERS *******************
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
//****************************************************************
//******************** 2. ALL COOL KEYWORDS **********************
/*
The official list of token names is:
------------------------------------
{at case class colon comma divide dot else equals esac false fi identifier if in inherits integer isvoid
larrow lbrace le let loop lparen lt minus new not of plus pool rarrow rbrace rparen semi string then tilde
times true type while}.
*/
//******************** 2.1 OOP KEYWORDS **************************
INHERITS : I N H E R I T S ;
CLASS : C L A S S ;
NEW  : N E W ;
SELF: S E L F;
//******************** 2.2 CONDITIONAL KEYWORDS ******************
IF  : I F ;
THEN : T H E N ;
ELSE : E L S E;
FI : F I ;
CASE : C A S E ;
OF   : O F ;
ESAC : E S A C;
//******************** 2.3 LOOP KEYWORDS ************************
WHILE : W H I L E ;
LOOP : L O O P ;
POOL : P O O L ;
LET  : L E T ;
IN   : I N ;
//******************** 2.4 PRIMITIVE KEYWORDS *******************
INTEGER : [0-9]+ ;
LITERAL :  '"'([a-zA-Z0-9\\: .!@#'$%^-]|'+')*'"' ;
TYPE: [A-Z][_0-9A-Za-z]*;
ID : [a-zA-Z][_a-zA-Z0-9]*;
//******************** 2.5 OPERATOR KEYWORDS ********************
ASSIGN_OPERATOR : '<-' ;
CASE_ARROW : '=>' ;
EQUAL : '=' ;
SMALLER_THAN : '<' ;
BIGGER_THAN : '>' ;
LESS_THAN_OR_EQUAL : '<=';
PLUS : '+' ;
MINUS : '-' ;
DIVIDE : '/' ;
MULTIPLY : '*' ;
INTEGER_NEGATIVE: '~';
//******************** 2.6 SPACE KEYWORDS ***********************
WHITESPACE : (' '  | '\t') -> skip;
NEWLINE : ('\r'? '\n' | '\r')-> skip;
//******************** 2.7 SEPARATOR KEYWORDS *******************
OPEN_COMMENT: '(*';
CLOSE_COMMENT : '*)';
COMMENT : OPEN_COMMENT (COMMENT | .)*? CLOSE_COMMENT -> skip ;
ONE_LINE_COMMENT: '--' (~ '\n')* '\n'? -> skip ;
OPEN_CURLY : '{' ;
CLOSE_CURLY : '}' ;
OPENP_PRANSIS : '(' ;
CLOSE_PRANSIS : ')' ;
OPEN_SQUARE : '[';
CLOSE_SQUARE: ']';
SEMICOLUN : ';';
COLUN : ':' ;
COMMA : ',' ;
DOT : '.';
AT : '@';
ERROR : . ;
//******************** 2.8 OTHER KEYWORDS ***********************
ISVOID : I S V O I D ;
NOT  : N O T ;
TRUE : 't' R U E ;
FALSE : 'f' A L S E ;
IDENTIFIER : I D E N T I F I E R ;
LARROW : L A R R O W ;
LBRACE : L B R A C E ;
LE : L E ;
LPAREN : L P A R E N ;
LT : L T ;
RARROW : R A R R O W ;
RBRACE : R B R A C E ;
RPAREN : R P A R E N ;
SEMI : S E M I ;
STRING : S T R I N G ;
TILDE : T I L D E ;
TIMES : T I M E S ;
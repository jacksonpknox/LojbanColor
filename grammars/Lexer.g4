grammar Lexer;
/*
 * Lexer rules
 */

WS : [ \t]+ ;
NEWLINE : '\r'? '\n' ; 
DOT : '.' ;
C : [bcdfgjklmnprstvxz] ;
V : [aeiou] ;
Y : 'y' ;
AP : '\'' ;
EXTRA : [hqw!?1234567890] ;
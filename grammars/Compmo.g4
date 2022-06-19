grammar Compmo;
/*
 * Parser Rules
 */
compmo : COMPMO ;

/*
 * Lexer rules
 */

COMPMO : CMAV CMAV+ ;
fragment CMAV : ('.' | C) V ('\'' | V)* ;

fragment V : [aeiou] ;
fragment C : [bcdfgjklmnprstvxz] ;
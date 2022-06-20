grammar Compmo;
/*
 * Parser Rules
 */
compmo : COMPMO ;

/*
 * Lexer rules
 */

COMPMO : CMAV CMAV+ ;
fragment CMAV : ('.' | C) V ('\'' | V)*
              | C 'y.' ;

fragment V : [aeiou] ;
fragment C : [bcdfgjklmnprstvxz] ;
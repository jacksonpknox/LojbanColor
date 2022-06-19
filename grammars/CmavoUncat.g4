grammar CmavoUncat;
/*
 * Parser Rules
 */
uncat : UNCAT ;

/*
 * Lexer Rules
 */
UNCAT : ('.' | C) V ('\'' | V)* ;

fragment V : [aeiou] ;
fragment C : [bcdfgjklmnprstvxz] ;

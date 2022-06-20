grammar Cmavo;

cmavo : CMAVO ;

CMAVO : ('.' | C) V ('\'' | V)* ;

fragment V : [aeiou] ;
fragment C : [bcdfgjklmnprstvxz] ;
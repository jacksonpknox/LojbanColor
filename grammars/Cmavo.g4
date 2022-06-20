grammar Cmavo;

cmavo : CMAVO ;

CMAVO : ('.' | C) V ('\'' | V)* 
      | C 'y.';

fragment V : [aeiou] ;
fragment C : [bcdfgjklmnprstvxz] ;
grammar Cmavo;

cmavo : (DOT | C) V (AP | V)*
      | C Y DOT
      ;


WS : (' ' | '\t') -> skip ;
DOT : '.' ;
C : [bcdfgjklmnprstvxz] ;
V : [aeiou] ;
AP : '\'' ;
Y : 'y' ;
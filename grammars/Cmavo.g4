grammar Cmavo;

cmavo : (DOT | C) V (AP | V)*
      | C Y DOT
      ;


DOT : '.' ;
C : [bcdfgjklmnprstvxz] ;
V : [aeiou] ;
AP : '\'' ;
Y : 'y' ;
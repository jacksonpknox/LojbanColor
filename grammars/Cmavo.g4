grammar Cmavo;

cmavo : cat_cmavo
      | lerfu
      ;

cat_cmavo : (DOT | C) V (AP | V)* ;

lerfu : C Y DOT ;

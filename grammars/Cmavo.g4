grammar Cmavo;

import CmavoAB,BAI,BY,UI,CmavoCD,CmavoF,CmavoGI,CmavoJK,CmavoL,CmavoMN,CmavoP,CmavoRS,CmavoT,CmavoVY,CmavoZ;

cmavo : cmavoab
      | bai
      | by
      | cmavocd
      | cmavof
      | cmavogi
      | cmavojk
      | cmavol
      | cmavomn
      | cmavop
      | cmavors
      | cmavot
      | ui
      | cmavovy
      | cmavoz
      | UNCAT
      ;

/*
 * Lexer rules
 */

UNCAT : ('.' | C) V ('\''? V)* ;

fragment C : [bcdfgjklmnprstvxz] ;
fragment V : [aeiou] ;

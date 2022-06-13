grammar Cmavo;
import CmavoAB;
import CmavoCD;
import CmavoF;
import CmavoGI;

cmavo : pa 
      | cmavoab
      | cmavocd
      | cmavof
      | cmavogi
      ;

pa : PA ;

/*
 * Lexer Rules
 */
PA : 'pa'
   | 're'
   | 'ci'
   | 'vo'
   | 'mu'
   | 'xa'
   | 'ze'
   | 'bi'
   | 'so'
   | 'no'
   ;

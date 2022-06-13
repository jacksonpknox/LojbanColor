grammar Cmavo;
import CmavoAB;

cmavo : pa 
      | cmavoab;

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

grammar Color;
import Brivla,Cmavo,Fuhivla;

folio : (sentence '\r'? '\n')+ EOF;

sentence : word* ;

word : cmavo | brivla | cmene | fuhivla ;

cmene : CMENE ;

/*
 * Lexer Rules
 */

CMENE : L* C '.' ;

fragment L : C | V ;
fragment C : [bcdfgjklmnprstvxz] ;
fragment V : [aeiou] ;


grammar Color;
import Brivla,Cmavo,Fuhivla;

folio : (sentence '\r'? '\n')+ EOF;

sentence : word (WS word)* | ;

word : cmavo | brivla | cmene | compmo | fuhivla ;

compmo : cmavo cmavo+ ;
cmene : DOT? (C | V)* C DOT ;

/*
 * Lexer Rules
 */

WS : [ \t]+ ;
DOT : '.' ;
C : [bcdfgjklmnprstvxz] ;
V : [aeiou] ;


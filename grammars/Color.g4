grammar Color;
import Brivla,Cmavo,Compmo,Fuhivla;

folio : (sentence '\r'? '\n')+ EOF;

sentence : word (WS word)* | ;

word : cmavo | brivla | cmene | compmo | fuhivla ;

cmene : DOT? (C | V)* C DOT ;

/*
 * Lexer Rules
 */

WS : (' ' | '\t')+ ;
DOT : '.' ;
C : [bcdfgjklmnprstvxz,] ;
V : [aeiouy] ;


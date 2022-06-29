grammar Color;
import Brivla,Cmavo,Fuhivla;

folio : (sentence NEWLINE)+ EOF;

sentence : word (WS word)* | ;

word : cmavo | brivla | cmene | compmo | fuhivla ;

compmo : cmavo cmavo+ ;
cmene : DOT? (C | V)* C DOT ;

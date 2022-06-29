grammar Color;
import Brivla,Cmavo,Fuhivla;

folio : line* end ;

line : flufftence NEWLINE ;
end : flufftence EOF ;

flufftence : WS? sentence? WS? ;
sentence : word (WS word)* ;

word : cmavo | brivla | cmene | compmo | fuhivla ;

compmo : cmavo cmavo+ ;
cmene : DOT? (C | V)* C DOT ;

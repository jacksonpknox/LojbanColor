grammar Skaban;
import Brivla,Fuhivla;

folio : line* end ;

line : flufftence NEWLINE ;
end : flufftence EOF ;

flufftence : WS? sentence? WS? ;
sentence : word (WS word)* ;

word : cmavo | jonvla | brivla | cmene | fuhivla ;

cmavo: karmaho | lerfu ;
jonvla: cmavo cmavo+ ;
cmene : DOT? (C | V)* C DOT ;

karmaho : (DOT | C) V (AP | V)* ;
lerfu : C Y DOT ;

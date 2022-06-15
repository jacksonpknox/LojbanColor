grammar Color;
import Brivla,Cmavo,Fuhivla;

folio : (sentence '\r'? '\n')+ EOF;

sentence : word* ;

word : cmavo | brivla | fuhivla ;
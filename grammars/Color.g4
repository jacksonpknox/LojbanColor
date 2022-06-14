grammar Color;
import Brivla,Cmavo;

folio : (sentence '\r'? '\n')+ ;

sentence : word+ ;

word : cmavo | brivla ;

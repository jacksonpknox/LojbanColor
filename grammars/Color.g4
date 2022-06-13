grammar Color;
import Cmavo;

folio : (sentence '\r'? '\n')+ ;

sentence : word+ ;

word : cmavo | lujvo ;

lujvo : LUJVO ;

/*
 * Lexer Rules
 */
WS : (' ' | '\t') -> skip ;

LUJVO : BOBVO | COBVO | DOBVO | FOBVO | GISMU ;

fragment BOBVO : RAFPAIRCON Y TAILVO ;
fragment COBVO : (RAFPAIRCON | RAFPAIRVOW) TAILVO? ;
fragment DOBVO : STUMP Y TAILVO ;
fragment FOBVO : RAFSTUMP Y TAILVO ;
fragment GISMU : C (C V | V C) C V ;

fragment C : [bcdfgjklmnprstvxz] ;
fragment V : [aeiou] ;
fragment RAFPAIRCON : (BALRAF Q? | BRORAF | BAURAF Q) BALRAF ;
fragment Y : 'y' ;
fragment TAILVO : (BALRAF Y? | STUMP Y | VURAF)* (VURAF | GISMU) ;
fragment RAFPAIRVOW : (BALRAF | BRORAF | BAURAF) Q? BRORAF
                    | (BALRAF Q? | VURAF Q) BAURAF
                    ;
fragment STUMP : CASTUMP | CKSTUMP ;
fragment RAFSTUMP : BALRAF Q? STUMP
                  | VURAF Q CASTUMP
                  | VURAF CKSTUMP
                  ;

fragment BALRAF : C V C ;
fragment Q : 'q' ;
fragment BRORAF : C C V ;
fragment BAURAF : C V '\''? V ;
fragment VURAF : BAURAF | BRORAF ;
fragment CASTUMP : C V C C ;
fragment CKSTUMP : C C V C ;

grammar Brivla;

brivla : lujvo | gismu ;
lujvo : LUJVO ;
gismu : GISMU ;

/*
 * Lexer Rules
 */
WS : (' ' | '\t') -> skip ;

GISMU : GISUM ;
fragment GISUM : C (C V | V C) C V ;

LUJVO : BOBVO | COBVO | DOBVO | FOBVO ;

fragment BOBVO : RAFPAIRCON Y TAILVO ;
fragment COBVO : (RAFPAIRCON | RAFPAIRVOW) TAILVO? ;
fragment DOBVO : STUMP Y TAILVO ;
fragment FOBVO : RAFSTUMP Y TAILVO ;

fragment C : [bcdfgjklmnprstvxz] ;
fragment V : [aeiou] ;
fragment RAFPAIRCON : (BALRAF Q? | BRORAF | BAURAF Q) BALRAF ;
fragment TAILVO : (BALRAF Y? | STUMP Y | VURAF)* (VURAF | GISUM) ;
fragment RAFPAIRVOW : (BALRAF | BRORAF | BAURAF) Q? BRORAF
                    | ((BALRAF | BRORAF) Q? | BAURAF Q) BAURAF
                    ;
fragment STUMP : CASTUMP | CKSTUMP ;
fragment RAFSTUMP : BALRAF Q? STUMP
                  | VURAF Q CASTUMP //BUG HERE LOL
                  | VURAF CKSTUMP
                  ;

fragment BALRAF : C V C ;
fragment Q : 'q' | 'r' | 'l' ;
fragment BRORAF : C C V ;
fragment BAURAF : C V '\''? V ;
fragment VURAF : BAURAF | BRORAF ;
fragment CASTUMP : C V C C ;
fragment CKSTUMP : C C V C ;
fragment Y : 'y';
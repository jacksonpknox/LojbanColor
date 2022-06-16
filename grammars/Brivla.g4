grammar Brivla;

brivla : lujvo | gismu ;
lujvo : LUJVO ;
gismu : GISMU ;

/*
 * Lexer Rules
 */
WS : (' ' | '\t') -> skip ;

GISMU : GISUM ;
fragment GISUM : CAGISMU | CKAGISMU ;
fragment CAGISMU : C V C C V ;
fragment CKAGISMU : C C V C V ;
fragment C : [bcdfgjklmnprstvxz] ;
fragment V : [aeiou] ;

LUJVO : BOBVO | COBVO | DOBVO | FOBVO | GOBVO | JOBVO | KOBVO;

// we split the lujvo in to whatever most elegant small family of disjoint family
// of sets can be constructed.
// in this case we are aiming at the structure of the root.
fragment BOBVO : RAFPAIRCON Y TAILVO ;
fragment COBVO : (RAFPAIRCON | RAFPAIRVOW) TAILVO? ;
fragment DOBVO : STUMP Y TAILVO ;
fragment FOBVO : RAFSTUMP Y TAILVO ;
fragment GOBVO : (BALRAF | BRORAF) Q? GISMU ;
// trolling
fragment JOBVO : BAURAF Q CAGISMU ;
fragment KOBVO : BAURAF Q? CKAGISMU ;
// you can think about the ones with no tailvo separately since their lenghts will be finite

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
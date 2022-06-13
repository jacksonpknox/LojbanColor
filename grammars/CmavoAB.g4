grammar CmavoAB;
/*
 * Parser Rules
 */
cmavoab : a
        | bahe
        | beho
        | bei
        | be
        | bihe
        | boi
        | bo
        | bu
        ; 

a : A ;
bahe : BAHE ;
beho : BEHO ;
bei : BEI ;
be : BE ;
bihe : BIHE ;
boi : BOI ;
bo : BO ;
bu : BU ;


/*
 * Lexer Rules
 */
A : '.a' 
  | '.e'
  | '.o'
  | '.u'
  ;

BAHE : 'ba\'e'
     | 'za\'e'
     ;

BEHO : 'be\'o' ;

BEI : 'bei' ;

BE : 'be' ;

BIHE : 'bi\'e' ;

BIHI : 'bi\'i'
     | 'bi\'o'
     | 'mi\'i'
     ;

BOI : 'boi' ;

BO : 'bo' ;

BU : 'bu' ;

grammar Color;

folio : (sentence '\n')+ ;
sentence : word (word)* ;
word : cmavo | gismu | lujvo ;
cmavo : PA ;
lujvo : bobvo | lobvo | vobvo | sobvo ;
bobvo : cabvo y tailvo ;
lobvo : (cabvo | vabvo) tailvo? ;
vobvo : fourraf y tailvo ;
sobvo : (curaf q? fourraf | vuraf q vafourraf | vuraf cafourraf) y tailvo ;

cabvo : (curaf q? | vuraf q) curaf ;
tailvo : (curaf y? | fourraf y | vuraf)* (vuraf | gismu) ;
vabvo : (curaf q? | vuraf q) vuraf ;
fourraf : vafourraf | cafourraf ;
curaf : C V C ;
vuraf : C V V
      | C C V
      | C V '\'' V
      ;
vafourraf : C V C C ;
cafourraf : C C V C ;

gismu : C (C V | V C) C V ;


y : Y ;
q : Q ;

/*
 * Lexer Rules
 */
WS : ' ' -> skip ;

PA : ('pa' | 're' | 'ci' | 'vo' | 'mu' | 'xa' | 'ze' | 'bi' | 'so' | 'no') ;

Y : 'y' ;

Q : 'q' ;

C : [bcdfgjklmnprstvxz] ;

V : [aeiou] ;

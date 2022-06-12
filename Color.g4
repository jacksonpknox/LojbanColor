grammar Color;

folio : (sentence '\r'? '\n')+ ;

sentence : word+ ;

word : cmavo | gismu | lujvo ;

cmavo : PA ;
gismu : C (C V | V C) C V ; //this may be a grave error indeed.. put lujvo after gismu if it breaks
lujvo : bobvo | cobvo | dobvo | fobvo ;

bobvo : tworafcon y tailvo ;
cobvo : (tworafcon | tworafvow) tailvo? ;
dobvo : fourraf y tailvo ;
fobvo : (balraf q? fourraf | vuraf q cafourraf | vuraf ckfourraf) y tailvo ; // bug here... vuraf cafourraf does not need q if vuraf is broraf

tworafcon : (balraf q? | vuraf q) balraf ;
y : Y ;
tailvo : (balraf y? | fourraf y | vuraf)* (vuraf | gismu) ;
tworafvow : (balraf q? | vuraf q) vuraf ;
fourraf : cafourraf | ckfourraf ;
balraf : C V C ;
q : Q ;
vuraf : bauraf | broraf ;
cafourraf : C V C C ;
ckfourraf : C C V C ;

bauraf : C V '\''? V ;
broraf : C C V ;



/*
 * Lexer Rules
 */
WS : ' ' -> skip ;

PA : ('pa' | 're' | 'ci' | 'vo' | 'mu' | 'xa' | 'ze' | 'bi' | 'so' | 'no') ;

Y : 'y' ;

Q : 'q' ;

C : [bcdfgjklmnprstvxz] ;

V : [aeiou] ;

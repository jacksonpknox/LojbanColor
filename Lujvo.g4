grammar Lujvo;

lujvo : bobvo | cobvo | dobvo | fobvo | gismu;

bobvo : tworafcon y tailvo ; // tworaf root with bridge to tail
cobvo : (tworafcon | tworafvow) tailvo? ; // tworaf root with no bridge to tail (if tail)
dobvo : stump y tailvo ; // fourraf root
fobvo : rafstump y tailvo ; // rafstump root
gismu : C (C V | V C) C V ;

tworafcon : (balraf q? | broraf | bauraf q) balraf ;
y : Y ;
tailvo : (balraf y? | stump y | vuraf)* (vuraf | gismu) ;
tworafvow : (balraf | broraf | bauraf) q? broraf
          | (balraf q? | vuraf q) bauraf
          ;
stump : cafourraf | ckfourraf ;
rafstump : balraf q? stump
         | vuraf q cafourraf
         | vuraf ckfourraf
         ;

balraf : C V C ;
q : Q ;
broraf : C C V ;
bauraf : C V '\''? V ;
vuraf : bauraf | broraf ;
cafourraf : C V C C ;
ckfourraf : C C V C ;

/*
 * Lexer Rules
 */
Y : 'y' ;

Q : 'q' ;

C : [bcdfgjklmnprstvxz] ;

V : [aeiou] ;
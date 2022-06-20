grammar Lujvo;

lujvo : bobvo | cobvo | dobvo | fobvo | gobvo | jobvo | kobvo;

bobvo : tworafcon y tailvo ; // tworaf root with bridge to tail
cobvo : (tworafcon | tworafvow) tailvo? ; // tworaf root with no bridge to tail (if tail)
dobvo : stump y tailvo ; // fourraf root
fobvo : rafstump y tailvo ; // rafstump root
gobvo : balraf (q | y)? gismu
      | broraf q? gismu
      ;
jobvo : bauraf q cagismu ;
kobvo : bauraf q? ckagismu ;
gismu : cagismu | ckagismu ;
cagismu : C V C C V ;
ckagismu : C C V C V ;

tworafcon : (balraf (q | y)? | broraf q? | bauraf q) balraf ;
y : Y ;
tailvo : (balraf y? | stump y | vuraf)* (vuraf | gismu) ;
tworafvow : (balraf (q | y)? | broraf q? | bauraf q?) broraf
          | (balraf (q | y)? | broraf q? | bauraf q) bauraf
          ;
stump : cafourraf | ckfourraf ;
rafstump : balraf q? stump
         | vuraf q cafourraf
         | vuraf ckfourraf
         ;

balraf : C V C ;
q : C ;
broraf : C C V ;
bauraf : C V '\''? V ;
vuraf : bauraf | broraf ;
cafourraf : C V C C ;
ckfourraf : C C V C ;

/*
 * Lexer Rules
 */
Y : 'y' ;

C : [bcdfgjklmnprstvxz] ;

V : [aeiou] ;
grammar Brivla;
import Lexer;

brivla : gismu | lujvo ;

gismu : kargismu | gahorgismu ;
lujvo : bobvo | cobvo | dobvo | fobvo | gobvo ;


kargismu : C V C C V ;
gahorgismu : C C V C V ;

bobvo : balrelraf y jvoreb ;
cobvo : relraf jvoreb? ;
dobvo : gimpag y jvoreb ;
fobvo : rafgimpag y jvoreb ;
gobvo : balraf (q | y)? gismu
      | broraf q? gismu
      | bauraf q kargismu

      | bauraf q? gahorgismu

      ;


balrelraf : (balraf (q | y)? | broraf q? | bauraf q) balraf ;
jvoreb : (balraf y? | gimpag y | karlraf)* (karlraf | gismu) ;

relraf : balrelraf | karlrelraf ;

gimpag : gahorgimpag | kargimpag ;

rafgimpag : balraf q? gimpag
          | karlraf q kargimpag
          | karlraf gahorgimpag
          ;

balraf : C V C ;
broraf : C C V ;
bauraf : C V AP? V ;


karlraf : broraf | bauraf ;

karlrelraf : (balraf (q | y)? | broraf q? | bauraf q?) broraf
           | (balraf (q | y)? | broraf q? | bauraf q) bauraf
           ;

gahorgimpag : C C V C ;
kargimpag : C V C C ;


q : C ; // can be customized by breaking up C into subsets
y : Y ;

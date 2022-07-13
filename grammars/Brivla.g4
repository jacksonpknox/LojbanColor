grammar Brivla;
import Lexer;

brivla : gismu | lujvo ;

gismu : kargismu | gahorgismu ;
lujvo : bobvo | cobvo | dobvo | fobvo | gobvo ;


kargismu : C V C C V ;
gahorgismu : C C V C V ;

bobvo : balrelraf y jvorebla ;
cobvo : relraf jvorebla? ;
dobvo : gimsygenja y jvorebla ;
fobvo : rafgimpag y jvorebla ;
gobvo : balraf (q | y)? gismu
      | broraf q? gismu
      | bauraf q kargismu

      | bauraf q? gahorgismu

      ;


balrelraf : (balraf (q | y)? | broraf q? | bauraf q) balraf ;
jvorebla : (balraf y? | gimsygenja y | karlraf)* (karlraf | gismu) ;

relraf : balrelraf | karlrelraf ;

gimsygenja : gahorgimsygenja | kargimsygenja ;

rafgimpag : balraf q? gimsygenja
          | karlraf q kargimsygenja
          | karlraf gahorgimsygenja
          ;

balraf : C V C ;
broraf : C C V ;
bauraf : C V AP? V ;


karlraf : broraf | bauraf ;

karlrelraf : (balraf (q | y)? | broraf q? | bauraf q?) broraf
           | (balraf (q | y)? | broraf q? | bauraf q) bauraf
           ;

gahorgimsygenja : C C V C ;
kargimsygenja : C V C C ;


q : C ; // can be customized by breaking up C into subsets
y : Y ;

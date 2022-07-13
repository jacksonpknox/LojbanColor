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
gobvo : ganlycmarafsi (q | y)? gismu
      | gahorkarcmarafsi q? gismu
      | karkarcmarafsi q kargismu
      | karkarcmarafsi q? gahorgismu
      ;


balrelraf : (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q) ganlycmarafsi ;
jvorebla : (ganlycmarafsi y? | gimsygenja y | karcmarafsi)* (karcmarafsi | gismu) ;

relraf : balrelraf | karlrelraf ;

gimsygenja : gahorgimsygenja | kargimsygenja ;

rafgimpag : ganlycmarafsi q? gimsygenja
          | karcmarafsi q kargimsygenja
          | karcmarafsi gahorgimsygenja
          ;

ganlycmarafsi : C V C ;
gahorkarcmarafsi : C C V ;
karkarcmarafsi : C V AP? V ;


karcmarafsi : gahorkarcmarafsi | karkarcmarafsi ;

karlrelraf : (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q?) gahorkarcmarafsi
           | (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q) karkarcmarafsi
           ;

gahorgimsygenja : C C V C ;
kargimsygenja : C V C C ;


q : C ; // can be customized by breaking up C into subsets
y : Y ;

grammar Brivla;
import Lexer;

brivla : gismu | lujvo ;

gismu : kargismu | gahorgismu ;
lujvo : bobvo | cobvo | dobvo | fobvo | gobvo ;


kargismu : C V C C V ;
gahorgismu : C C V C V ;

bobvo : ganlyrelrafsi y jvorebla ;
cobvo : relrafsi jvorebla? ;
dobvo : gimsygenja y jvorebla ;
fobvo : rafsygimsygenja y jvorebla ;
gobvo : ganlycmarafsi (q | y)? gismu
      | gahorkarcmarafsi q? gismu
      | karkarcmarafsi q kargismu
      | karkarcmarafsi q? gahorgismu
      ;


ganlyrelrafsi : (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q) ganlycmarafsi ;
jvorebla : (ganlycmarafsi y? | gimsygenja y | karcmarafsi)* (karcmarafsi | gismu) ;

relrafsi : ganlyrelrafsi | karlyrelrafsi ;

gimsygenja : gahorgimsygenja | kargimsygenja ;

rafsygimsygenja : ganlycmarafsi q? gimsygenja
          | karcmarafsi q kargimsygenja
          | karcmarafsi gahorgimsygenja
          ;

ganlycmarafsi : C V C ;
gahorkarcmarafsi : C C V ;
karkarcmarafsi : C V AP? V ;


karcmarafsi : gahorkarcmarafsi | karkarcmarafsi ;

karlyrelrafsi : (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q?) gahorkarcmarafsi
           | (ganlycmarafsi (q | y)? | gahorkarcmarafsi q? | karkarcmarafsi q) karkarcmarafsi
           ;

gahorgimsygenja : C C V C ;
kargimsygenja : C V C C ;


q : C ; // can be customized by breaking up C into subsets
y : Y ;

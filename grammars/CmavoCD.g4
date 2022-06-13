grammar CmavoCD;
/*
 * Parser Rules
 */
cmavocd : caha
        | cehe
        | cei
        | co
        | cu
        | cuhe
        | daho
        | doi
        ;

caha : CAHA ;
cehe : CEHE ;
cei : CEI ;
co : CO ;
cu : CU ;
cuhe : CUHE ;
daho : DAHO ;
doi : DOI ;

/* 
 * Lexer Rules
 */

CAHA : 'ca\'a'
     | 'ka\'e'
     | 'nu\'o'
     | 'pu\'i'
     ;

CEHE : 'ce\'e' ;

CEI : 'cei' ;

CO : 'co' ;

CU : 'cu' ;

CUHE : 'cu\'e'
     | 'nau'
     ;

DAHO : 'da\'o' ;

DOHU : 'do\'u' ;

DOI : 'doi' ;
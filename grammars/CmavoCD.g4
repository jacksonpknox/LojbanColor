grammar CmavoCD;
/*
 * Parser Rules
 */
cmavocd : caha
        | cai
        | cehe
        | cei
        | co
        | coi
        | cu
        | cuhe
        | daho
        | doi
        ;

caha : CAHA ;
cai : CAI ;
cehe : CEHE ;
cei : CEI ;
co : CO ;
coi : COI ;
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

CAI : 'cai'
    | 'sai'
    | 'ru\'e'
    | 'cu\'i'
    | 'pei'
    ;

CEHE : 'ce\'e' ;

CEI : 'cei' ;

CO : 'co' ;

COI : 'coi'
    | 'co\'o'
    | 'ju\'i'
    | 'nu\'e'
    | 'pe\'u'
    | 'ki\'e'
    | 'fi\'i'
    | 'be\'e'
    | 're\'i'
    | 'mu\'o'
    | 'je\'e'
    | 'vi\'o'
    | 'ke\'o'
    | 'fe\'o'
    | 'mi\'e'
    ;

CU : 'cu' ;

CUHE : 'cu\'e'
     | 'nau'
     ;

DAHO : 'da\'o' ;

DOHU : 'do\'u' ;

DOI : 'doi' ;
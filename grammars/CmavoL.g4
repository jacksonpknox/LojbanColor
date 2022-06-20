grammar CmavoL;
/*
 * Parser Rules
 */
cmavol : lahe
    | la
    | lau
    | lehu
    | le
    | lihu
    | li
    | loho
    | lohu
    | luhu
    | lu
    ;

lahe : LAHE ;
la : LA ;
lau : LAU ;
lehu : LEHU ;
le : LE ;
lihu : LIHU ;
li : LI ;
loho : LOHO ;
lohu : LOHU ;
luhu : LUHU ;
lu : LU ;

/*
 * Lexer Rules
 */

LAHE : 'la\'e'
        | 'lu\'e'
        | 'tu\'a'
        | 'lu\'a'
        | 'lu\'i'
        | 'lu\'o'
        | 'vu\'i'
    ;

LA : 'la'
    ;

LAU : 'tau'
        | 'zai'
        | 'ce\'a'
        | 'lau'
    ;

LEHU : 'le\'u'
    ;

LE : 'le'
        | 'lo'
        | 'lo\'e'
        | 'loi'
    ;

LIHU : 'li\'u'
    ;

LI : 'li'
    ;

LOHO : 'lo\'o'
    ;

LOHU : 'lo\'u'
    ;

LUHU : 'lu\'u'
    ;

LU : 'lu'
    ;


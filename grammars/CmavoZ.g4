grammar CmavoZ;
/*
 * Parser Rules
 */
cmavoz : zaho
    | zeha
    | zei
    | zihe
    | zi
    | zohu
    | zoi
    | zo
    ;

zaho : ZAHO ;
zeha : ZEHA ;
zei : ZEI ;
zihe : ZIHE ;
zi : ZI ;
zohu : ZOHU ;
zoi : ZOI ;
zo : ZO ;

/*
 * Lexer Rules
 */

ZAHO : 'pu\'o'
        | 'ca\'o'
        | 'ba\'o'
        | 'co\'a'
        | 'co\'u'
        | 'mo\'u'
        | 'za\'o'
        | 'co\'i'
        | 'de\'a'
        | 'di\'a'
    ;

ZEHA : 'ze\'i'
        | 'ze\'a'
        | 'ze\'u'
    ;

ZEI : 'zei'
    ;

ZIHE : 'zi\'e'
    ;

ZI : 'zi'
        | 'za'
        | 'zu'
    ;

ZOHU : 'zo\'u'
    ;

ZOI : 'zoi'
    ;

ZO : 'zo'
    ;


grammar CmavoT;
/*
 * Parser Rules
 */
cmavot : tahe
    | tehu
    | tei
    | toi
    | to
    | tuhe
    | tuhu
    ;

tahe : TAHE ;
tehu : TEHU ;
tei : TEI ;
toi : TOI ;
to : TO ;
tuhe : TUHE ;
tuhu : TUHU ;

/*
 * Lexer Rules
 */

TAHE : 'di\'i'
        | 'na\'o'
        | 'ru\'i'
        | 'ta\'e'
    ;

TEHU : 'te\'u'
    ;

TEI : 'tei'
    ;

TOI : 'toi'
    ;

TO : 'to'
    ;

TUHE : 'tu\'e'
    ;

TUHU : 'tu\'u'
    ;


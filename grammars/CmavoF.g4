grammar CmavoF;
/*
 * Parser Rules
 */
cmavof : fa
    | faha
    | faho
    | fehe
    | fehu
    | fiho
    | foi
    | fuha
    | fuhe
    | fuho
    ;

fa : FA ;
faha : FAHA ;
faho : FAHO ;
fehe : FEHE ;
fehu : FEHU ;
fiho : FIHO ;
foi  : FOI  ;
fuha : FUHA ;
fuhe : FUHE ;
fuho : FUHO ;

/*
 * Lexer Rules
 */

FA : 'fa'
        | 'fe'
        | 'fi'
        | 'fo'
        | 'fu'
        | 'fi\'a'
        | 'fai'
    ;

FAHA : 'ca\'u'
        | 'ti\'a'
        | 'zu\'a'
        | 'ga\'u'
        | 'ni\'a'
        | 'ne\'i'
        | 'ru\'u'
        | 'pa\'o'
        | 'ne\'a'
        | 'te\'e'
        | 're\'o'
        | 'fa\'a'
        | 'to\'o'
        | 'zo\'i'
        | 'ze\'o'
        | 'zo\'a'
        | 'be\'a'
        | 'ne\'u'
        | 'du\'a'
        | 'vu\'a'
        | 'bu\'u'
    ;

FAHO : 'fa\'o'
    ;

FEHE : 'fe\'e'
    ;

FEHU : 'fe\'u'
    ;

FIHO : 'fi\'o'
    ;

FOI : 'foi'
    ;

FUHA : 'fu\'a'
    ;

FUHE : 'fu\'e'
    ;

FUHO : 'fu\'o'
    ;


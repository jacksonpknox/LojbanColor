grammar CmavoGI;
/*
 * Parser Rules
 */
cmavogi : ga
    | gaho
    | gehu
    | gi
    | giha
    | goha
    | goi
    | guha
    | i
    ;

ga : GA ;
gaho : GAHO ;
gehu : GEHU ;
gi : GI ;
giha : GIHA ;
goha : GOHA ;
goi : GOI ;
guha : GUHA ;
i : I ;

/*
 * Lexer Rules
 */

GA : 'ga'
        | 'ge'
        | 'go'
        | 'gu'
    ;

GAHO : 'ga\'o'
        | 'ke\'i'
    ;

GEHU : 'ge\'u'
    ;

GI : 'gi'
    ;

GIHA : 'gi\'a'
        | 'gi\'e'
        | 'gi\'o'
        | 'gi\'u'
    ;

GOHA : 'go\'i'
        | 'go\'a'
        | 'go\'u'
        | 'go\'e'
        | 'go\'o'
        | 'nei'
        | 'no\'a'
        | 'bu\'a'
        | 'bu\'e'
        | 'bu\'i'
        | 'co\'e'
        | 'mo'
        | 'du'
    ;

GOI : 'pe'
        | 'po'
        | 'po\'e'
        | 'po\'u'
        | 'ne'
        | 'no\'u'
    ;

GUHA : 'gu\'a'
        | 'gu\'e'
        | 'gu\'o'
        | 'gu\'u'
    ;

I : '.i'
    ;


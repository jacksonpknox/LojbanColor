grammar CmavoVY;
/*
 * Parser Rules
 */
cmavovy : va
    | vau
    | veha
    | veho
    | vei
    | viha
    | vuho
    | vuhu
    | xi
    | y
    ;

va : VA ;
vau : VAU ;
veha : VEHA ;
veho : VEHO ;
vei : VEI ;
viha : VIHA ;
vuho : VUHO ;
vuhu : VUHU ;
xi : XI ;
y : Y ;

/*
 * Lexer Rules
 */

VA : 'vi'
        | 'va'
        | 'vu'
    ;

VAU : 'vau'
    ;

VEHA : 've\'i'
        | 've\'a'
        | 've\'u'
        | 've\'e'
    ;

VEHO : 've\'o'
    ;

VEI : 'vei'
    ;

VIHA : 'vi\'i'
        | 'vi\'a'
        | 'vi\'u'
        | 'vi\'e'
    ;

VUHO : 'vu\'o'
    ;

VUHU : 'su\'i'
        | 'vu\'u'
        | 'pi\'i'
        | 'te\'a'
        | 'va\'a'
        | 'ju\'u'
        | 'ge\'a'
        | 'gei'
        | 'pi\'a'
        | 'sa\'i'
        | 'fe\'a'
    ;

XI : 'xi'
    ;

Y : '.y.'
    ;


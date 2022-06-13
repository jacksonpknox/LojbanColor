grammar CmavoP;
/*
 * Parser Rules
 */
cmavop : pa
    | pehe
    | peho
    | pu
    ;

pa : PA ;
pehe : PEHE ;
peho : PEHO ;
pu : PU ;

/*
 * Lexer Rules
 */

PA : 'pa'
        | 're'
        | 'ci'
        | 'vo'
        | 'mu'
        | 'xa'
        | 'ze'
        | 'bi'
        | 'so'
        | 'no'
        | 'ma\'u'
        | 'ni\'u'
        | 'pi'
        | 'fi\'u'
        | 'ra\'e'
        | 'ce\'i'
        | 'ki\'o'
        | 'ci\'i'
        | 'ka\'o'
        | 'pai'
        | 'te\'o'
        | 'ro'
        | 'so\'a'
        | 'so\'e'
        | 'so\'i'
        | 'so\'u'
        | 'no\'o'
        | 'da\'a'
        | 'rau'
        | 'du\'e'
        | 'mo\'a'
        | 'dau'
        | 'fei'
        | 'gai'
        | 'jau'
        | 'rei'
        | 'vai'
        | 'pi\'e'
        | 'xo'
        | 'tu\'o'
        | 'ji\'i'
        | 'su\'e'
        | 'su\'o'
        | 'me\'i'
        | 'za\'u'
    ;

PEHE : 'pe\'e'
    ;

PEHO : 'pe\'o'
    ;

PU : 'pu'
        | 'ca'
        | 'ba'
    ;


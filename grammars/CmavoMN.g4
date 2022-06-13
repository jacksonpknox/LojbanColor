grammar CmavoMN;
/*
 * Parser Rules
 */
cmavomn : maho
    | mai
    | mehu
    | me
    | mohe
    | mohi
    | moi
    | nahe
    | nahu
    | nai
    | na
    | nihe
    | niho
    | noi
    | nuha
    | nuhi
    | nuhu
    | nu
    ;

maho : MAHO ;
mai : MAI ;
mehu : MEHU ;
me : ME ;
mohe : MOHE ;
mohi : MOHI ;
moi : MOI ;
nahe : NAHE ;
nahu : NAHU ;
nai : NAI ;
na : NA ;
nihe : NIHE ;
niho : NIHO ;
noi : NOI ;
nuha : NUHA ;
nuhi : NUHI ;
nuhu : NUHU ;
nu : NU ;

/*
 * Lexer Rules
 */

MAHO : 'ma\'o'
    ;

MAI : 'mai'
        | 'mo\'o'
    ;

MEHU : 'me\'u'
    ;

ME : 'me'
    ;

MOHE : 'mo\'e'
    ;

MOHI : 'mo\'i'
    ;

MOI : 'moi'
        | 'mei'
        | 'si\'e'
        | 'cu\'o'
        | 'va\'e'
    ;

NAHE : 'na\'e'
        | 'to\'e'
        | 'no\'e'
    ;

NAHU : 'na\'u'
    ;

NAI : 'nai'
    ;

NA : 'na'
        | 'ja\'a'
    ;

NIHE : 'ni\'e'
    ;

NIHO : 'ni\'o'
    ;

NOI : 'noi'
        | 'poi'
        | 'voi'
    ;

NUHA : 'nu\'a'
    ;

NUHI : 'nu\'i'
    ;

NUHU : 'nu\'u'
    ;

NU : 'nu'
        | 'mu\'e'
        | 'pu\'u'
        | 'zu\'o'
        | 'za\'i'
        | 'ka'
        | 'ni'
        | 'du\'u'
        | 'li\'i'
        | 'si\'o'
        | 'su\'u'
    ;


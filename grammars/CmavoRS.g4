grammar CmavoRS;
/*
 * Parser Rules
 */
cmavors : raho
    | roi
    | sa
    | sehu
    | sei
    | se
    | si
    | soi
    | su
    ;

raho : RAHO ;
roi : ROI ;
sa : SA ;
sehu : SEHU ;
sei : SEI ;
se : SE ;
si : SI ;
soi : SOI ;
su : SU ;

/*
 * Lexer Rules
 */

RAHO : 'ra\'o'
    ;

ROI : 'roi'
        | 're\'u'
    ;

SA : 'sa'
    ;

SEHU : 'se\'u'
    ;

SEI : 'sei'
    ;

SE : 'se'
        | 'te'
        | 've'
        | 'xe'
    ;

SI : 'si'
    ;

SOI : 'soi'
    ;

SU : 'su'
    ;


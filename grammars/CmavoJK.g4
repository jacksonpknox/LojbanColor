grammar CmavoJK;
/*
 * Parser Rules
 */
cmavojk : jai
    | ja
    | johi
    | joi
    | kehe
    | kei
    | ke
    | ki
    | koha
    | kuhe
    | kuho
    | ku
    ;

jai : JAI ;
ja : JA ;
johi : JOHI ;
joi : JOI ;
kehe : KEHE ;
kei : KEI ;
ke : KE ;
ki : KI ;
koha : KOHA ;
kuhe : KUHE ;
kuho : KUHO ;
ku : KU ;

/*
 * Lexer Rules
 */

JAI : 'jai'
    ;

JA : 'ja'
        | 'je'
        | 'jo'
        | 'ju'
    ;

JOHI : 'jo\'i'
    ;

JOI : 'joi'
        | 'ce'
        | 'ce\'o'
        | 'jo\'u'
        | 'fa\'u'
        | 'jo\'e'
        | 'ku\'a'
        | 'pi\'u'
    ;

KEHE : 'ke\'e'
    ;

KEI : 'kei'
    ;

KE : 'ke'
    ;

KI : 'ki'
    ;

KOHA : 'mi'
        | 'do'
        | 'mi\'o'
        | 'mi\'a'
        | 'ma\'a'
        | 'do\'o'
        | 'ko'
        | 'ti'
        | 'ta'
        | 'tu'
        | 'di\'u'
        | 'de\'u'
        | 'da\'u'
        | 'ti\'e'
        | 'de\'e'
        | 'da\'e'
        | 'dei'
        | 'do\'i'
        | 'ko\'a'
        | 'ko\'e'
        | 'ko\'i'
        | 'ko\'o'
        | 'ko\'u'
        | 'fo\'a'
        | 'fo\'e'
        | 'fo\'i'
        | 'fo\'o'
        | 'fo\'u'
        | 'ri'
        | 'ra'
        | 'ru'
        | 'zo\'e'
        | 'zu\'i'
        | 'zi\'o'
        | 'vo\'a'
        | 'vo\'e'
        | 'vo\'i'
        | 'vo\'o'
        | 'vo\'u'
        | 'ma'
        | 'ke\'a'
        | 'ce\'u'
        | 'da'
        | 'de'
        | 'di'
    ;

KUHE : 'ku\'e'
    ;

KUHO : 'ku\'o'
    ;

KU : 'ku'
    ;


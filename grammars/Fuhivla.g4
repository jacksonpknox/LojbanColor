grammar Fuhivla ;

fuhivla : ANYCHAR+ ;

/*
 * Lexer rules
 */

ANYCHAR : ~[ \t\r\n] ;
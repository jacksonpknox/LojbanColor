grammar Fuhivla ;

fuhivla : anychar+ ;

anychar : C | V | DOT | Y | AP | EXTRA ;

/*
 * Lexer rules
 */

EXTRA : ~[ \t\r\n] ;
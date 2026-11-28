lexer grammar ViryaLexer;

@header {
package antlr4;
}

// Types
INT : 'int';
STRING : 'string';
BOOLEAN : 'bool';
VOID : 'void';

// Flow
IF : 'if';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
ELSEIF : 'else if';

// Visibility
PRIVATE : 'private';
PUBLIC : 'public';

// Thingies
SCOPE_OPEN : '{';
SCOPE_CLOSE : '}';
PAR_OPEN : '(';
PAR_CLOSE : ')';
INHERIT : '<';
END_STATEMENT : ';';
ASSIGN : '=';
SEPERATE : ',';

// Instant values
BOOL_VAL : TRUE | FALSE;
TRUE : 'true';
FALSE : 'false';
IDENTIFIER : ('a'..'z'|'A'..'Z')+('a'..'z'|'A'..'Z'|'0'..'9')*;
INTEGER_VAL : '0'| ('-')?'1'..'9'('0'..'9')*;
STRING_VAL : '"' .*? '"';

EOL   : [\n];
WS    : [ \t\r\n]+ -> skip ;
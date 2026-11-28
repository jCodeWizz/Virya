parser grammar ViryaParser;

options { tokenVocab = ViryaLexer; }

@header {
package antlr4;
}

file: statement*;
statement: assignment;
expression: INT;
assignment: (INT | STRING | BOOLEAN)? IDENTIFIER ASSIGN expression END_STATEMENT;
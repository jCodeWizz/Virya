parser grammar ViryaParser;

options { tokenVocab = ViryaLexer; }

@header {
package antlr4;
}

expression: INT;
assignment: (INT | STRING | BOOLEAN)? IDENTIFIER ASSIGN expression END_STATEMENT;
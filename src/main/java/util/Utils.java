package util;

import antlr4.ViryaLexer;
import antlr4.ViryaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Utils {

    public static ParseTree parseTree(String input) {
        CharStream charStream = CharStreams.fromString(input);
        ViryaLexer lexer = new ViryaLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        ViryaParser parser = new ViryaParser(tokenStream);

        return parser.file();
    }

    public static List<Integer> getTokens(String input) {
        CharStream charStream = CharStreams.fromString(input);
        ViryaLexer lexer = new ViryaLexer(charStream);

        return lexer.getAllTokens().stream()
                .map(Token::getType)
                .toList();
    }
}

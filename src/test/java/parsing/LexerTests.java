package parsing;

import org.junit.Test;
import util.Utils;

import java.util.Arrays;
import java.util.List;

import static antlr4.ViryaLexer.*;
import static org.junit.Assert.assertEquals;

public class LexerTests {

    @Test
    public void testTokensSimpleReAssignment() {
        List<Integer> actual = Utils.getTokens("x = 41;");
        List<Integer> expected = Arrays.asList(
                IDENTIFIER,
                ASSIGN,
                INTEGER_VAL,
                END_STATEMENT
        );
        assertEquals(expected, actual);
    }

    @Test
    public void testTokensSimpleAssignment() {
        List<Integer> actual = Utils.getTokens("int x = 41;");
        List<Integer> expected = Arrays.asList(
                INT,
                IDENTIFIER,
                ASSIGN,
                INTEGER_VAL,
                END_STATEMENT
        );
        assertEquals(expected, actual);
    }

}

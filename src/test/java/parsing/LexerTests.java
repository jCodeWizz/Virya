package parsing;

import org.junit.Test;
import util.Utils;

import java.util.Arrays;
import java.util.List;

import static antlr4.ViryaLexer.*;
import static org.junit.Assert.*;

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

    @Test
    public void testTokensSimpleAssignmentWrong() {
        List<Integer> actual = Utils.getTokens("int x = 41k;");
        List<Integer> expected = Arrays.asList(INT, IDENTIFIER, ASSIGN, INTEGER_VAL, END_STATEMENT);
        assertNotEquals(actual, expected);
    }

    @Test
    public void testTokenMethodAndCall() {
        List<Integer> actual = Utils.getTokens("public void getName(int x, int y) {}");
        List<Integer> expected = Arrays.asList(PUBLIC, VOID, IDENTIFIER, PAR_OPEN, INT, IDENTIFIER, SEPERATE, INT, IDENTIFIER, PAR_CLOSE, SCOPE_OPEN, SCOPE_CLOSE);
        assertEquals(actual, expected);

        actual = Utils.getTokens("getName(5, 5);");
        expected = Arrays.asList(IDENTIFIER, PAR_OPEN, INTEGER_VAL, SEPERATE, INTEGER_VAL, PAR_CLOSE, END_STATEMENT);
        assertEquals(actual, expected);
    }

}

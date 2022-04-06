package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }

    @Test
    public void onlyBracketsReturnsTrueWithMixedCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("My [Bracket] "));
    }

    @Test
    public void onlyBracketsReturnsTrueWithSeveralMatches() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("My [Bracket] is [better] than [yours]"));
    }

    @Test
    public void onlyBracketsReturnsFalseParentheses() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void repeatedBracketWhenMatchedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void equalBracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("] ["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("A st]ring"));
    }


//    @Test(expected = IllegalArgumentException.class)
//    public void balancedBracketsDoesNotAcceptInt() {
//        BalancedBrackets.hasBalancedBrackets();
//    }

    // onlyBrackets throws exception if passed an integer
    // onlyBrackets throws exception if passed a double
    // throws exception if passed an array of strings
    // accepts string parameters (does not throw illegal argument exception)
    // a string with un-matched brackets returns false
    // a string with matched brackets and other characters returns true
    // returns true if string passed has several sets of matched brackets
    // returns false for matched curly brackets
    // returns false for matched parentheses


}

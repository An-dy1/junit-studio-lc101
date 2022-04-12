package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // single pair of matched brackets returns true
    // only left bracket returns false
    // only right bracket returns false
    // matched brackets mixed with other characters returns true
    // several separate matched brackets returns true
    // matched parentheses only returns false
    // * empty string returns false
    // matched nested brackets returns true
    // unmatched nested brackets returns false
    // * must have at least one set of brackets

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("A st]ring"));
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

    // I differed from the instructions here with the empty string
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void matchedNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[a string[]]]"));
    }

    @Test
    public void equalBracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[  ]] ] ["));
    }



    // accepts string parameters (does not throw illegal argument exception)
    // a string with un-matched brackets returns false
    // a string with matched brackets and other characters returns true
    // returns true if string passed has several sets of matched brackets
    // returns false for matched curly brackets
    // returns false for matched parentheses


}

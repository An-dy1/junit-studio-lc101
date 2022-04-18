package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // HAPPY PATH
    // single pair of matched brackets returns true
    // matched brackets mixed with other characters returns true
    // several separate matched brackets returns true
    // matched nested brackets returns true

    // ERRORS
    // only left bracket returns false
    // only right bracket returns false
    // matched parentheses only returns false
    // * empty string returns false - I decided it has to have at least one set of brackets to pass
    // unmatched nested brackets returns false


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
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
    public void matchedNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[a string [and another] ]]"));
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
    public void onlyBracketsReturnsFalseParentheses() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }

    // I differed from the instructions here with the empty string
    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }


    @Test
    public void equalBracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("] ] shouldn't work [ ["));
    }



}

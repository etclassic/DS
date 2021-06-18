package Stack;

import org.junit.Test;

import org.junit.*;

public class InfixToPostFixTest {

    @Test
    public void infixToPostfixConversion() {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        InfixToPostFix infixToPostFix = new InfixToPostFix();
        Assert.assertEquals("abcd^e-fgh*+^*+i-", infixToPostFix.infixToPostfixConversion(exp));
    }
}

package Stack;

import org.junit.Assert;
import org.junit.Test;

public class InfixEvaluationTest {

    @Test
    public void evaluateInfix(){
        String str = " 10 + 2 * 6 ";

        InfixEvaluation infixEvaluation = new InfixEvaluation();
        Assert.assertEquals(22, infixEvaluation.evaluateInfix(str));
    }


}

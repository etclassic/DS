package Stack;

import org.junit.Assert;
import org.junit.Test;

public class PostFixEvaluationTest {

    @Test
    public void postFixEvaluation(){
        PostFixEvaluation postFixEvaluation = new PostFixEvaluation();
        String exp = "100 200 + 2 / 5 * 7 + ";

        Assert.assertEquals(757, postFixEvaluation.postFixEvaluation(exp));
    }
}

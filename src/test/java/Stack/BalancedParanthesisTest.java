package Stack;

import org.junit.Assert;
import org.junit.Test;

public class BalancedParanthesisTest {

    @Test
    public void isParanthesisBalancedTest(){
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        char[] chars = {'(','(',')',')','[',']','{','}'};
        Assert.assertEquals(true, balancedParanthesis.isParanthesisBalanced(chars));

        char[] charss = {')'};
        Assert.assertEquals(false, balancedParanthesis.isParanthesisBalanced(charss));
    }

}

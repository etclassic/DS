package Stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class CheckPairWiseOrderTest {

    @Test
    public void pairWiseConsecutive(){

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(-4);
        integerStack.push(-5);

        CheckPairWiseOrder checkPairWiseOrder = new CheckPairWiseOrder();
        Assert.assertEquals(true, checkPairWiseOrder.pairWiseConsecutive(integerStack));


    }
}

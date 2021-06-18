package Stack;

import org.junit.Test;
import org.junit.Assert;

public class ReverseStackTest {

    @Test
    public void reverse(){

        //Using Recursion
        ReverseStack reverseStack = new ReverseStack();

        reverseStack.stackInt.push(1);
        reverseStack.stackInt.push(2);
        reverseStack.stackInt.push(3);
        reverseStack.stackInt.push(4);

        reverseStack.reverse();

        Assert.assertEquals(new Integer(1), reverseStack.stackInt.pop());
        Assert.assertEquals(new Integer(2), reverseStack.stackInt.pop());



        //Using LinkedList
        StackNode stackNode = new StackNode(1);
        EfficientReverseStack ds = new EfficientReverseStack();
        ds.top = stackNode;

        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);

        ds.reverse();

        Assert.assertEquals(1, ds.pop());
        Assert.assertEquals(2, ds.pop());

    }
}

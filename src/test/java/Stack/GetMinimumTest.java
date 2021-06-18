package Stack;

import org.junit.Assert;
import org.junit.Test;

public class GetMinimumTest {

    @Test
   public void getMinimum(){

       GetMinimum minStack = new GetMinimum();

       minStack.push(6);
       Assert.assertEquals( 6, minStack.getMin());
       minStack.push(4);
        minStack.push(3);
        Assert.assertEquals( 3, minStack.getMin());
        minStack.push(2);
        minStack.push(1);
        Assert.assertEquals( 1, minStack.getMin());
        minStack.push(1);
        Assert.assertEquals( 1, minStack.getMin());

   }
}

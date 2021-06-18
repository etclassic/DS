package Stack;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBasedStackImplementationTest {

    @Test
    public void push(){
        LinkedListBasedStackImplementation linkedListBasedStackImplementation = new LinkedListBasedStackImplementation();
        linkedListBasedStackImplementation.push(2);
        linkedListBasedStackImplementation.push(3);
        linkedListBasedStackImplementation.push(4);
        linkedListBasedStackImplementation.push(8);


        Assert.assertEquals(8, linkedListBasedStackImplementation.pop());
        Assert.assertEquals(4, linkedListBasedStackImplementation.pop());
        Assert.assertEquals(3, linkedListBasedStackImplementation.pop());
        Assert.assertEquals(2, linkedListBasedStackImplementation.pop());
    }

}

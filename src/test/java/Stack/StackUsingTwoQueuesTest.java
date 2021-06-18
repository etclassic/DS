package Stack;

import org.junit.Test;
import org.junit.Assert;

import java.util.EmptyStackException;

public class StackUsingTwoQueuesTest {

    @Test(expected = EmptyStackException.class)
    public void stackUsingTwoQueuesTest() {

        StackUsingTwoQueues stackUsingTwoQueues = new StackUsingTwoQueues();

        stackUsingTwoQueues.push(1);
        stackUsingTwoQueues.push(2);
        stackUsingTwoQueues.push(3);
        stackUsingTwoQueues.push(4);
        stackUsingTwoQueues.push(5);

        Assert.assertEquals( 5, stackUsingTwoQueues.top());
        Assert.assertEquals(5, stackUsingTwoQueues.pop());
        Assert.assertEquals(4, stackUsingTwoQueues.pop());
        Assert.assertEquals(3, stackUsingTwoQueues.pop());
        Assert.assertEquals(2, stackUsingTwoQueues.pop());
        Assert.assertEquals(1, stackUsingTwoQueues.top());
        Assert.assertEquals(1, stackUsingTwoQueues.pop());

        stackUsingTwoQueues.top();
        stackUsingTwoQueues.pop();
    }
}

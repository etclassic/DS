package Stack;

import org.junit.Assert;
import org.junit.Test;
import java.util.Stack;

public class QueueUsingTwoStacksTest {

    @Test
    public void QueueUsingStacks(){

        QueueUsingTwoStacks.Queue queue = new QueueUsingTwoStacks.Queue();
        queue.stack = new Stack<>();

        QueueUsingTwoStacks ds = new QueueUsingTwoStacks();

        ds.enQueue(queue.stack, 2);
        ds.enQueue(queue.stack, 3);
        ds.enQueue(queue.stack, 4);

        Assert.assertEquals(2, ds.deQueue(queue.stack));
        Assert.assertEquals(3, ds.deQueue(queue.stack));
        Assert.assertEquals(4, ds.deQueue(queue.stack));

    }
}

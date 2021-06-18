package Queue;

import org.junit.Assert;
import org.junit.Test;

public class ArrayBasedQueueImplementationTest {

    @Test
    public void Queue(){
        ArrayBasedQueueImplementation queueImplementation = new ArrayBasedQueueImplementation(8);
        queueImplementation.enQueue(1);
        queueImplementation.enQueue(2);
        queueImplementation.enQueue(3);
        queueImplementation.enQueue(4);
        queueImplementation.enQueue(5);
        queueImplementation.enQueue(6);
        queueImplementation.enQueue(7);
        queueImplementation.enQueue(8);
        queueImplementation.enQueue(1);

        Assert.assertEquals(1, queueImplementation.deQueue());
        Assert.assertEquals(2, queueImplementation.deQueue());
        Assert.assertEquals(3, queueImplementation.deQueue());
        Assert.assertEquals(4, queueImplementation.deQueue());
        Assert.assertEquals(5, queueImplementation.deQueue());
        Assert.assertEquals(6, queueImplementation.deQueue());
        Assert.assertEquals(7, queueImplementation.deQueue());
        Assert.assertEquals(8, queueImplementation.deQueue());
        queueImplementation.deQueue();

    }
}

package Queue;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBasedQueueImplementationTest {

    @Test
    public void implementQueueTest(){

        LinkedListBasedQueueImplementation queueImplementation = new LinkedListBasedQueueImplementation();

        queueImplementation.enQueue(1);
        queueImplementation.enQueue(2);
        queueImplementation.enQueue(3);
        queueImplementation.enQueue(4);
        queueImplementation.enQueue(5);

        Assert.assertEquals(1,  queueImplementation.deQueue());
        Assert.assertEquals(2,  queueImplementation.deQueue());
        Assert.assertEquals(3,  queueImplementation.deQueue());
        Assert.assertEquals(4,  queueImplementation.deQueue());
        Assert.assertEquals(5,  queueImplementation.deQueue());
        queueImplementation.deQueue();




    }
}
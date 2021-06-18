package Queue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueueTest {

    @Test
    public void interleaveQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        InterleaveQueue interleaveQueue = new InterleaveQueue();
        interleaveQueue.interleaveQueue(queue);

        System.out.println(queue);
    }
}

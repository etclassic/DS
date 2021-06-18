package Queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseTest {

    @Test
    public void reverseQueueIterative(){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        Reverse reverse = new Reverse();
        reverse.reverseQueueIterative(queue);

        int[] arr = new int[]{5, 4, 3, 2, 1};
        int i = 0;
        for(Integer key : queue){
            Assert.assertEquals((int)key, arr[i++]);
        }
    }

    @Test
    public void reverseQueueRecursive(){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        Reverse reverse = new Reverse();
        reverse.reverseQueueRecursive(queue);

        int[] arr = new int[]{50, 40, 30, 20, 10};
        int i = 0;
        for(Integer key : queue){
            Assert.assertEquals((int)key, arr[i++]);
        }
    }
}

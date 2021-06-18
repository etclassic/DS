package Queue;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElementsTest {

    @Test
    public void reverseFirstKElements(){

        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);

        ReverseFirstKElements reverseFirstKElements = new ReverseFirstKElements();
        reverseFirstKElements.reverseFirstKElements(integerQueue, 3);

        int[] arr = {3,2,1,4,5};
        int i = 0;
        for ( Integer k : integerQueue){
            Assert.assertEquals((int)k, arr[i++]);
        }
    }
}

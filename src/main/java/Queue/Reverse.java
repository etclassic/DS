package Queue;

import java.util.Queue;
import java.util.Stack;

public class Reverse {

    public void reverseQueueIterative(Queue<Integer> queue){

        Stack<Integer> integerStack = new Stack<>();

        while(!queue.isEmpty()){
            integerStack.push(queue.poll());
        }

        while(!integerStack.isEmpty()){
            queue.add(integerStack.pop());
        }
    }

    public void reverseQueueRecursive(Queue<Integer> queue){

        if(queue.isEmpty()){
            return;
        }

        int x_1 = queue.poll();
        reverseQueueRecursive(queue);

        queue.add(x_1);

    }
}

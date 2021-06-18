package Queue;

import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {

    public void interleaveQueue(Queue<Integer> queue){
        if(queue.size() % 2 != 0 ){
            System.out.println("Input size should be even..");
            return;
        }

        Stack<Integer> integerStack = new Stack<>();
        int halfSize = queue.size()/2;

        for (int i = 0; i < halfSize; i++) {
            integerStack.push(queue.poll());
        }

        while(!integerStack.isEmpty()){
            queue.add(integerStack.pop());
        }

        for (int i = 0; i < halfSize; i++) {
            queue.add(queue.poll());
        }

        for (int i = 0; i < halfSize; i++) {
            integerStack.push(queue.poll());
        }

        while(!integerStack.isEmpty()){
            queue.add(integerStack.pop());
            queue.add(queue.poll());
        }
    }
}

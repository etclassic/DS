package Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public void reverseFirstKElements(Queue<Integer> integerQueue, int k){

        Stack<Integer> integerStack = new Stack<>();

        if(integerQueue.isEmpty() || k > integerQueue.size()){
            return;
        }

        if(k <= 0){
            return;
        }

        for (int i = 0; i < k; i++) {
            integerStack.push(integerQueue.poll());
        }

        for (int i = 0; i < k; i++) {
            integerQueue.add(integerStack.pop());
        }

        for (int i = 0; i < integerQueue.size()-k; i++) {
            integerQueue.add(integerQueue.peek());
            integerQueue.poll();
        }
    }
}

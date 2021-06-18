package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPairWiseOrder {

    public boolean pairWiseConsecutive(Stack<Integer> integerStack){

        Queue<Integer> queue = new LinkedList<>();

        while( !integerStack.isEmpty()){
            queue.add(integerStack.pop());
        }

        while (!queue.isEmpty()){
            integerStack.push(queue.poll());
        }

        while (integerStack.size() > 1){
            int x_1 = integerStack.pop();
            int x_2 = integerStack.pop();

            if(Math.abs(x_1 - x_2) != 1){
                return false;
            }

            queue.add(x_1);
            queue.add(x_2);
        }

        if(integerStack.size() == 1){
            queue.add(integerStack.pop());
        }

        while(!queue.isEmpty()){
            integerStack.push(queue.poll());
        }

        return true;

    }
}

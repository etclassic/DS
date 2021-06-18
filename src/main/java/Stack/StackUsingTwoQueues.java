package Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

    Queue<Integer> queue_1 = new LinkedList<>();
    Queue<Integer> queue_2 = new LinkedList<>();


    public void push(int data){
        queue_1.add(data);
    }

    public int pop(){

        if(queue_1.isEmpty()){
            throw new EmptyStackException();
        }

        while(queue_1.size() > 1){
            queue_2.add(queue_1.remove());
        }

        int x = queue_1.remove();

        Queue temp_queue = queue_1;
        queue_1 = queue_2;
        queue_2 = temp_queue;

        return x;
    }

    public int top(){
        if(queue_1.isEmpty()){
            throw new EmptyStackException();
        }

        while(queue_1.size() > 1){
            queue_2.add(queue_1.remove());
        }

        int x = queue_1.peek();
        queue_2.add(queue_1.remove());

        Queue temp_queue = queue_1;
        queue_1 = queue_2;
        queue_2 = temp_queue;

        return x;
    }
}

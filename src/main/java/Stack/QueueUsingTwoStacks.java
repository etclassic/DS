package Stack;

import java.util.Stack;

// Using function call stack
public class QueueUsingTwoStacks {

    static class Queue{
        Stack<Integer> stack = new Stack<>();
    }

    public void push(Stack st, int x){
        st.push(x);
    }

    public int pop(Stack st){
        if(st.isEmpty()){
            System.out.println("Queue Underflow..");
        }else{
            return (int) st.pop();
        }
        return 0;
    }

    public void enQueue(Stack st, int data){
        st.push(data);
    }

    public int deQueue(Stack st){

        if(st.isEmpty()){
            System.out.println("Queue underflow..");
            System.exit(0);
        }else if(st.size() == 1){
            return (int)st.pop();
        }else{
            int x = (int) st.pop();
            int res = deQueue(st);
            enQueue(st, x);

            return res;
        }

        return 0;
    }
}

package Stack;

import java.util.Stack;

//Using Recursion
public class ReverseStack {

    Stack<Integer> stackInt = new Stack<>();

    public void reverse(){
        if(!stackInt.isEmpty()){
            int x = stackInt.pop();
            reverse();
            insert_at_bottom(x);
        }
    }

    private void insert_at_bottom(int x){
        if(stackInt.isEmpty()){
            stackInt.push(x);
        }else{
            int x1 = stackInt.pop();
            insert_at_bottom(x);
            stackInt.push(x1);
        }
    }
}

//Using LinkedList
class EfficientReverseStack{

    StackNode top;

    public void reverse(){

        StackNode curr, next, prev = null;

        curr = top;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        top = prev;
    }

    public void push(int x){
        StackNode node = new StackNode(x);

        if(top == null){
            top = node;
        }else{
            node.next = top;
            top = node;
        }
    }

    public int pop(){
        int x = 0;

        if(top == null){
            return x;
        }else{
            x = top.data;
            top = top.next;
        }
        return x;
    }
}

class StackNode{
    int data;
    StackNode next;

    StackNode(int data){
        this.data = data;
    }
}

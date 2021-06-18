package Stack;

import java.util.Stack;

public class GetMinimum extends Stack<Integer> {

    Stack<Integer> minStack  = new Stack<>();

    void push(int x){
        if(isEmpty()){
            super.push(x);
            minStack.push(x);
        }else{
            super.push(x);
            int y = minStack.peek();
            if(x <= y){
                minStack.push(x);
            }
        }
    }

    public Integer pop(){
        int x = super.pop();
        int y = minStack.pop();

        if(x != y){
            minStack.push(y);
        }

        return x;
    }

    int getMin(){
        int x = minStack.peek();
        return x;
    }

}

package Stack;

import java.util.Stack;

public class SortStack {

    //Iterative Approach
    public Stack<Integer> sortStack(Stack<Integer> stack){

        Stack<Integer> sortedStack = new Stack<>();

        while(!stack.isEmpty()){

            int tmp = stack.pop();

            while ( !sortedStack.isEmpty() && tmp < sortedStack.peek()){
                stack.push(sortedStack.pop());
            }

            sortedStack.push(tmp);
        }

        return sortedStack;
    }

    //Recursive Approach
    public void  sortStackRecursive(Stack<Integer> stack){

        if(!stack.isEmpty()){

            int x1 = stack.pop();
            sortStackRecursive(stack);
            sortedInsert(stack, x1);
        }

    }

    private void sortedInsert(Stack<Integer> stack, int x1) {

        if(stack.isEmpty() || x1 > stack.peek()){
            stack.push(x1);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, x1);
        stack.push(temp);
    }
}

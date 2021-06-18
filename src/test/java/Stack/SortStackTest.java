package Stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class SortStackTest {

    @Test
    public void sortStack(){

       Stack<Integer> stack1 = new Stack<>();
       stack1.push(3);
        stack1.push(8);
        stack1.push(5);
        stack1.push(4);
        stack1.push(0);
        stack1.push(2);

       SortStack sortStack = new SortStack();
//       System.out.println(sortStack.sortStack(stack1));
        sortStack.sortStackRecursive(stack1);
    }
}

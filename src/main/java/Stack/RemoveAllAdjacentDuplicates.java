package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public Stack<Integer> removeAdjacents(int[] arr){

        Stack<Integer> integerStack = new Stack<>();

        int i =0;

        while(i < arr.length){
            if(integerStack.isEmpty() || integerStack.peek() != arr[i]){
                integerStack.push(arr[i]);
                i++;
            }else if(integerStack.peek() == arr[i]){
                while(i < arr.length && arr[i] == integerStack.peek() ){
                    i++;
                }
                integerStack.pop();
            }
        }

        return integerStack;
    }
}

package Stack;

import java.util.Stack;

public class StockSpan {

    //Approach-1(Brute force)
    public int[] calculateSpan_Approach_1(int[] arr){

        int[] span = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int j = i-1;
            int span_1 = 1;
            while (j>=0 && arr[i] >= arr[j]){
                span_1++;
                j--;
            }
            span[i] = span_1;
        }

       return span;
    }

    //Approach-2
    public int[] calculateSpan_Approach_2(int [] arr){

        Stack<Integer> stackSpan = new Stack<>();
        int[] span = new int[arr.length];

        stackSpan.push(0);

        for (int i = 0; i < arr.length; i++) {

            while (!stackSpan.isEmpty() && arr[i] >= arr[stackSpan.peek()]){
                stackSpan.pop();
            }

            if(stackSpan.isEmpty()){
               span[i] = i+1;
            }else{
                span[i] = i - stackSpan.peek();
            }

            stackSpan.push(i);
        }

        return span;
    }
}

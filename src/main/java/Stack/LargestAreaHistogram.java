package Stack;

import java.util.Stack;

public class LargestAreaHistogram {

    public int calculateLargestArea(int [] arr){

        Stack<Integer> integerStack = new Stack<>();
        int area;
        int maxArea = 0;
        int i;

        for (i = 0; i < arr.length;) {
            if(integerStack.isEmpty() || arr[i] >= arr[integerStack.peek()]){
                integerStack.push(i);
                i++;
            }else{
                int top = integerStack.pop();
                if(integerStack.isEmpty()){
                    area = arr[top] * i ;
                }else {
                    area = arr[top] * (i - integerStack.peek() -1) ;
                }

                if(area > maxArea){
                    maxArea = area;
                }
            }

        }

        while (!integerStack.isEmpty()){
            int top = integerStack.pop();
            if(integerStack.isEmpty()){
                area = arr[top] * i ;
            }else {
                area = arr[top] * (i - integerStack.peek() -1) ;
            }

            if(area > maxArea){
                maxArea = area;
            }
        }

        return maxArea;
    }
}

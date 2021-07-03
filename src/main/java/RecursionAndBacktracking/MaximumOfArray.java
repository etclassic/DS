package RecursionAndBacktracking;

public class MaximumOfArray {

    public static int maxOfArray(int[] arr, int idx){
        if(idx ==  arr.length){
            return -1;
        }

        int imax = maxOfArray(arr, idx+1);
        return  Math.max(imax, arr[idx]);
    }
}

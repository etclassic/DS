package RecursionAndBacktracking;

public class FindFirstIndexOfOccurrence {

    public static int findIndex(int[] arr, int idx, int tar){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == tar){
            return idx;
        }else{
            return findIndex(arr, idx+1, tar);
        }

    }
}

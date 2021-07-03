package RecursionAndBacktracking;

public class FindLastIndexOfOccurrence {

    public static int findLastIndex(int[] arr, int idx, int target){
        if(idx == arr.length){
            return -1;
        }
        int loc = findLastIndex(arr, idx+1, target);
        if(arr[idx] == target && loc == -1){
           return idx;
        }
        return loc;
    }
}

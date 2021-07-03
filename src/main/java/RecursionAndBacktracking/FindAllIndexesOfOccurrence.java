package RecursionAndBacktracking;

import java.util.List;

public class FindAllIndexesOfOccurrence {

    public static List<Integer> findAllIndexes(int[] arr, int idx, int target, List<Integer> list){

        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        return findAllIndexes(arr, idx+1, target, list);
    }
}

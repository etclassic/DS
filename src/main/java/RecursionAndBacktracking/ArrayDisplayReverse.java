package RecursionAndBacktracking;

public class ArrayDisplayReverse {

    public static void displayArrayReverse(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        displayArrayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

package RecursionAndBacktracking;

public class ArrayDisplay {

    public static  void displayArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx+1);
    }
}

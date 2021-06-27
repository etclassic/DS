package RecursionAndBacktracking;

public class PrintDecreasingThenIncreasing {

    public void printDecreasingThenIncreasing(int num){
        //Base-case
        if(num == 0){
            return;
        }
        System.out.println(num);
        printDecreasingThenIncreasing(num-1);
        System.out.println(num);
    }
}

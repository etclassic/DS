package RecursionAndBacktracking;

public class PrintDecreasing {

    public void printDecreasingSequence(int num) {
        //Base case
        if(num == 0){
            return;
        }

        System.out.println(num);
        printDecreasingSequence(num-1);
    }
}

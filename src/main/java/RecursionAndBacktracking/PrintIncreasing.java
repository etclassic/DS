package RecursionAndBacktracking;

public class PrintIncreasing {

    public void printIncreasing(int num){
        //Base-case
        if(num == 0) {
            return;
        }
        printIncreasing(num-1);
        System.out.println(num);
    }
}

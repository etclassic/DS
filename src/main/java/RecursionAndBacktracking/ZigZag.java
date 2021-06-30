package RecursionAndBacktracking;

public class ZigZag {

    public void printZigzag(int num){

        if(num == 0){
            return;
        }

        System.out.println("Pre");
        printZigzag(num-1);
        System.out.println("In");
        printZigzag(num-1);
        System.out.println("Post");
    }
}

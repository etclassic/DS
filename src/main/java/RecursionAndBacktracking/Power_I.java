package RecursionAndBacktracking;

public class Power_I {

    public int power_I(int x, int n){

        if(n == 0){
            return 1;
        }

        return x * power_I(x, n-1);
    }
}

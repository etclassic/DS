package RecursionAndBacktracking;

public class Power_II {

    public int power_II(int x, int n){

        if (n == 0) {
         return 1;
        }

        int res_1 = power_II(x, n/2);
        int xn = res_1*res_1;

        if (n % 2 == 1) {
            xn = xn * x;
        }

        return xn;
    }

}

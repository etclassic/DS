package RecursionAndBacktracking;

public class PrintSubsequence {

    public static void printSubsequence(String str, String psf){
        if(str.length() == 0){
            System.out.println(psf);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSubsequence(ros, psf + ch);
        printSubsequence(ros, psf + "_");
    }
}

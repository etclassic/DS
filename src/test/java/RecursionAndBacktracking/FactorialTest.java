package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void printFactorialTest(){
        Factorial printFactorial = new Factorial();
        Assert.assertEquals(12, printFactorial.factorial(5));

    }

}
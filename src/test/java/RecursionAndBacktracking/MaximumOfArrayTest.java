package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOfArrayTest{

    @Test
    public void maxOfArray(){
        Assert.assertEquals(89, MaximumOfArray.maxOfArray(new int[]{67,89,1,23,5}, 0));
    }
}
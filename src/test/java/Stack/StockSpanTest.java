package Stack;

import org.junit.Test;
import org.junit.Assert;

public class StockSpanTest {

    @Test
    public void calculateSpan(){

        int[] arr = {6,3,4,5,2};
       StockSpan stockSpan = new StockSpan();
       Assert.assertArrayEquals(new int[]{1,1,2,3,1}, stockSpan.calculateSpan_Approach_1(arr)) ;
        Assert.assertArrayEquals(new int[]{1,1,2,3,1}, stockSpan.calculateSpan_Approach_2(arr)) ;
    }
}

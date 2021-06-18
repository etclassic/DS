package Stack;

import org.junit.Test;
import org.junit.Assert;


public class LargestAreaHistogramTest {

    @Test
    public void calculateLargestArea(){

        int[] arr = {2,1,2};
        int[] arr_1 = {2,1,2,3,1};

        LargestAreaHistogram largestAreaHistogram = new LargestAreaHistogram();
        Assert.assertEquals(3, largestAreaHistogram.calculateLargestArea(arr));
        Assert.assertEquals(5, largestAreaHistogram.calculateLargestArea(arr_1));
    }
}

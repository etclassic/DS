package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

public class Power_ITest {

    @Test
    public void power_ITest(){
        Power_I power_i = new Power_I();
        Assert.assertEquals(32, power_i.power_I(2,5));
    }

}
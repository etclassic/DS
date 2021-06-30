package RecursionAndBacktracking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Power_IITest{

    @Test
    public void power_II(){
        Power_II power_ii = new Power_II();
        Assert.assertEquals(32, power_ii.power_II(2, 5));
    }
}
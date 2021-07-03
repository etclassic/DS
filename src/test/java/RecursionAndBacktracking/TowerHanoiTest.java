package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class TowerHanoiTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void towerOfHanoiTest(){
        TowerHanoi.towerofHanoi(3, 1,2,3);
        Assert.assertEquals("1[1,2]\n" +
                "2[1,3]\n" +
                "1[2,3]\n" +
                "3[1,2]\n" +
                "1[3,1]\n" +
                "2[3,2]\n" +
                "1[1,2]", systemOutRule.getLog().trim());

    }
}
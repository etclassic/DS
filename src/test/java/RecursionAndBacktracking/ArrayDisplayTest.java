package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ArrayDisplayTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void displayArrayTest(){
        ArrayDisplay.displayArray(new int[]{2,5,9,12,45,98}, 0);
        Assert.assertEquals("2\n5\n9\n12\n45\n98", systemOutRule.getLog().trim());

    }
}
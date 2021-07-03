package RecursionAndBacktracking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ArrayDisplayReverseTest{


    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void displayArrayReverseTest(){
        ArrayDisplayReverse.displayArrayReverse(new int[]{2,5,9,12,45,98}, 0);
        Assert.assertEquals("98\n45\n12\n9\n5\n2", systemOutRule.getLog().trim());

    }
}
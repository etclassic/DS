package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ZigZagTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printZigzagTest(){
        ZigZag zigZag = new ZigZag();
        zigZag.printZigzag(2);
        Assert.assertEquals("Pre\nPre\nIn\nPost\nIn\nPre\nIn\nPost\nPost", systemOutRule.getLog().trim());

    }
}
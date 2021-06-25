package RecursionAndBacktracking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class PrintIncreasingTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printIncreasingTest(){
        PrintIncreasing printIncreasing = new PrintIncreasing();
        printIncreasing.printIncreasing(5);
        Assert.assertEquals("1\n2\n3\n4\n5", systemOutRule.getLog().trim());

    }
}
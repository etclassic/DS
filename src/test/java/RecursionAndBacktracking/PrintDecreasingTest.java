package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class PrintDecreasingTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printDecreasingTest(){
        PrintDecreasing printDecreasing = new PrintDecreasing();
        printDecreasing.printDecreasingSequence(5);
        Assert.assertEquals("5\n4\n3\n2\n1", systemOutRule.getLog().trim());

    }
}
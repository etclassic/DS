package RecursionAndBacktracking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class PrintDecreasingThenIncreasingTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printDecreasingThenIncreasing(){
        PrintDecreasingThenIncreasing printDecreasingThenIncreasing = new PrintDecreasingThenIncreasing();
        printDecreasingThenIncreasing.printDecreasingThenIncreasing(5);
        Assert.assertEquals("5\n4\n3\n2\n1\n1\n2\n3\n4\n5", systemOutRule.getLog().trim());

    }
}
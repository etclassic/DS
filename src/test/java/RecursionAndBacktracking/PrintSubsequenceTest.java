package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class PrintSubsequenceTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void printSubsequence(){
        PrintSubsequence.printSubsequence("abc","");
        Assert.assertEquals("abc\n" +
                "ab_\n" +
                "a_c\n" +
                "a__\n" +
                "_bc\n" +
                "_b_\n" +
                "__c\n" +
                "___", systemOutRule.getLog().trim());
    }
}
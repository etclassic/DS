package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetSubsequenceTest{

    @Test
    public void getSubsequence(){
        List<String> list = new ArrayList<>();
        list.add("___");list.add("__c");list.add("_b_");list.add("_bc");
        list.add("a__");list.add("a_c");list.add("ab_");list.add("abc");
        Assert.assertEquals(list, GetSubsequence.getSubsequence("abc"));
    }

}
package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

public class FindLastIndexOfOccurrenceTest {

    @Test
    public void findLastIndex(){
        Assert.assertEquals(5, FindLastIndexOfOccurrence.findLastIndex(new int[]{5,8,9,10,9,9}, 0, 9));
    }

}
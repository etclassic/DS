package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstIndexOfOccurrenceTest {

    @Test
    public void findIndex(){
        Assert.assertEquals(-1, FindFirstIndexOfOccurrence.findIndex(new int[]{23,1,5,8,90,3,1,1}, 0, 0));
    }

}
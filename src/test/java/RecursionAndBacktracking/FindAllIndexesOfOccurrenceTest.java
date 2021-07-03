package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FindAllIndexesOfOccurrenceTest{

    @Test
    public void findAllIndexes(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        Assert.assertEquals(expected , FindAllIndexesOfOccurrence.findAllIndexes(new int[]{5,8,9,10,9},0,9,new ArrayList<>()));
    }

}
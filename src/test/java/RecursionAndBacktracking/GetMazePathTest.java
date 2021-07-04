package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GetMazePathTest{

    @Test
    public void getMazePaths(){
        Assert.assertEquals(new ArrayList<>(), GetMazePath.getMazePaths(0,0,3,3));
    }

}
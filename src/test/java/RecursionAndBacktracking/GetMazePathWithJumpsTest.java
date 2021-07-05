package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathWithJumpsTest{

    @Test
    public void getMazePathsWithJumps(){
        List<String> list = new ArrayList<>();
        list.add("v1h1");list.add("h1v1");list.add("d1");
        Assert.assertEquals(list, GetMazePathWithJumps.getMazePathsWithJump(0,0,1,1));
    }
}
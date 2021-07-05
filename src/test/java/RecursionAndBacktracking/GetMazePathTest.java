package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathTest{

    @Test
    public void getMazePaths(){
        List<String> list = new ArrayList<>();
        list.add("hhvv");list.add("hvhv");list.add("hvvh");
        list.add("vhhv");list.add("vhvh");list.add("vvhh");
        Assert.assertEquals(list, GetMazePath.getMazePaths(0,0,2,2));
    }

}
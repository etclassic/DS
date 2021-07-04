package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetStairPathsTest{

    @Test
    public void getPaths(){
        List<String> list = new ArrayList<>();
        list.add("11111");list.add("1112");list.add("1121");
        list.add("113");list.add("1211");list.add("122");
        list.add("131");list.add("2111");list.add("212");
        list.add("221");list.add("23");list.add("311");
        list.add("32");

        Assert.assertEquals(list, GetStairPaths.getPaths(5));
    }

}
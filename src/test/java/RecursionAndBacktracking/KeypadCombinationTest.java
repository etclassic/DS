package RecursionAndBacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinationTest{

    @Test
    public void getCombination(){
        List<String> list  = new ArrayList<>();
        list.add("adg");list.add("adh");list.add("adi");
        list.add("aeg");list.add("aeh");list.add("aei");
        list.add("afg");list.add("afh");list.add("afi");
        list.add("bdg");list.add("bdh");list.add("bdi");
        list.add("beg");list.add("beh");list.add("bei");
        list.add("bfg");list.add("bfh");list.add("bfi");
        list.add("cdg");list.add("cdh");list.add("cdi");
        list.add("ceg");list.add("ceh");list.add("cei");
        list.add("cfg");list.add("cfh");list.add("cfi");
        Assert.assertEquals(list, KeypadCombination.getKeypadCombination("123"));
    }

}
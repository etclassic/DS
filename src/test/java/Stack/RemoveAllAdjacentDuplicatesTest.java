package Stack;

import org.junit.Test;

public class RemoveAllAdjacentDuplicatesTest {

    @Test
    public void removeAdjacents(){
        int[] arr = {1,5,6,8,8,8,0,1,1,0,6,5};

        RemoveAllAdjacentDuplicates removeAllAdjacentDuplicates = new RemoveAllAdjacentDuplicates();
        System.out.println(removeAllAdjacentDuplicates.removeAdjacents(arr));
    }
}

package Stack;

import org.junit.Assert;
import org.junit.Test;

public class DynamicArrayBasedStackImplementationTest {

    @Test
    public void push(){
        DynamicArrayBasedStackImplementation dy = new DynamicArrayBasedStackImplementation();
        dy.length = dy.BOUND;
        int [] arr = new int[dy.length];
        int[] arr_1 = dy.push(arr, 2);
        int[] arr_2 = dy.push(arr_1, 3);
        int[] arr_3 = dy.push(arr_2, 4);
        int[] arr_4 = dy.push(arr_3, 5);
        int[] arr_5 = dy.push(arr_4, 6);

        Assert.assertEquals(6, dy.pop(arr_5));
        Assert.assertEquals(5, dy.pop(arr_5));
        Assert.assertEquals(4, dy.pop(arr_5));
        Assert.assertEquals(3, dy.pop(arr_5));
    }

}

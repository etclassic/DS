package Stack;

import org.junit.Test;
import  org.junit.Assert;

public class TwoStacksUsingSingleArrayTest {

    @Test(expected = StackOverflowError.class)
    public void twoStacksUsingSingleArrayTest(){

        TwoStacksUsingSingleArray twoStacksUsingSinglrArray = new TwoStacksUsingSingleArray(4);
        twoStacksUsingSinglrArray.push1(1);
        twoStacksUsingSinglrArray.push1(2);

        twoStacksUsingSinglrArray.push2(3);
        twoStacksUsingSinglrArray.push2(4);

        twoStacksUsingSinglrArray.push2(5);

        Assert.assertEquals(2, twoStacksUsingSinglrArray.pop1());
        Assert.assertEquals(1, twoStacksUsingSinglrArray.pop1());

        Assert.assertEquals(4, twoStacksUsingSinglrArray.pop2());
        Assert.assertEquals(3, twoStacksUsingSinglrArray.pop2());

    }
}

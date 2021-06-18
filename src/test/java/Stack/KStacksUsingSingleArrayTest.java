package Stack;

import org.junit.Test;

import java.util.EmptyStackException;

public class KStacksUsingSingleArrayTest {

    @Test(expected = StackOverflowError.class)
    public void kStacksUsingSingleArrayTestTest(){

        KStacksUsingSingleArray kStacksUsingSingleArray = new KStacksUsingSingleArray(10, 3);

        kStacksUsingSingleArray.push(1,1);
        kStacksUsingSingleArray.push(2,1);
        kStacksUsingSingleArray.push(3,1);
        kStacksUsingSingleArray.push(4,1);

        kStacksUsingSingleArray.push(10,2);
        kStacksUsingSingleArray.push(20,2);

        kStacksUsingSingleArray.push(11,0);
        kStacksUsingSingleArray.push(22,0);
        kStacksUsingSingleArray.push(33,0);
        kStacksUsingSingleArray.push(44,0);
        kStacksUsingSingleArray.push(55,0);

        System.out.println(kStacksUsingSingleArray.pop(1));
        System.out.println(kStacksUsingSingleArray.pop(2));
        System.out.println(kStacksUsingSingleArray.pop(0));
    }
}

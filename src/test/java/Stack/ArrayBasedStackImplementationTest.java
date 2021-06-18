package Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayBasedStackImplementationTest {

    @Test
    public void pushAndPopTest(){
        ArrayBasedStackImplementation arrayBasedStackImplementation = new ArrayBasedStackImplementation();
        assertEquals(true, arrayBasedStackImplementation.push(2));
        assertEquals(true, arrayBasedStackImplementation.push(5));
        assertEquals(true, arrayBasedStackImplementation.push(9));
        assertEquals(true, arrayBasedStackImplementation.push(7));

        assertEquals(7, arrayBasedStackImplementation.pop());
        assertEquals(9, arrayBasedStackImplementation.pop());
        assertEquals(5, arrayBasedStackImplementation.pop());
        assertEquals(2, arrayBasedStackImplementation.pop());


    }
}

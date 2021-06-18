package Stack;

import org.junit.Test;
import org.junit.Assert;

public class IsPalindromeTest {

    @Test
    public void isPalindrome(){

       IsPalindrome isPalindrome = new IsPalindrome();
       Assert.assertEquals(true, isPalindrome.isPalindrome("daldaXadlad"));
       Assert.assertEquals(false, isPalindrome.isPalindrome("daldaXad"));
        Assert.assertEquals(false, isPalindrome.isPalindrome("daldaXadladaa"));

    }
}

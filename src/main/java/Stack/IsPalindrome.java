package Stack;

import java.util.Stack;

public class IsPalindrome {

    public boolean isPalindrome(String inputStr){

        char[] chars = inputStr.toCharArray();

        Stack<Character> stringStack = new Stack<>();

        int i=0;
        while(chars[i] != 'X'){
            stringStack.push(chars[i]);
            i++;
        }

        i++;

        while(i < chars.length){
            if(stringStack.isEmpty()) return false;
            if(chars[i] == stringStack.pop()){
                i++;
            }else{
                return false;
            }
        }

        if(stringStack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}

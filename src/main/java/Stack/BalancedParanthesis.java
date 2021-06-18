package Stack;

import java.util.Stack;

public class BalancedParanthesis {

    char[] chars = new char[100];

    boolean isParanthesisBalanced(char[] chars){
        Stack<Character> characterStack = new Stack<Character>();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                characterStack.push(chars[i]);
            }

            if(chars[i] == ')' || chars[i] == ']' || chars[i] == '}'){
                if(characterStack.isEmpty()){
                    return false;
                }else if(!isMatchingPair(characterStack.pop().charValue(), chars[i])){
                    return false;
                }
            }
        }

        if(characterStack.isEmpty()){
            return true;
        }else{
            return  false;
        }
    }

    private boolean isMatchingPair(char pop, char aChar) {
        if(pop == '(' && aChar == ')') return true;
            if(pop == '[' && aChar == ']') return  true;
                if(pop == '{' && aChar == '}') return  true;
                return false;
    }
}

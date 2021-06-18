package Stack;

import java.util.Stack;

public class InfixToPostFix {

    public String infixToPostfixConversion(String exp){

        Stack<Character> characterStack = new Stack<Character>();
        String result = new String();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result += c;
            }else if( c == '('){
                characterStack.push(c);
            }else if( c == ')' ){
                while( !characterStack.isEmpty() && characterStack.peek() != '('){
                    result += characterStack.pop();
                }
                if( !characterStack.isEmpty() && characterStack.peek() != '('){
                    return "Invalid Exp..";
                }else{
                    characterStack.pop();
                }
            }else{
                while(!characterStack.isEmpty() && Prec(characterStack.peek()) >= Prec(c)){
                    if( characterStack.peek() == '('){
                        return "Invalid Exp..";
                    }else{
                        result += characterStack.pop();
                    }
                }
                characterStack.push(c);
            }
        }

        while(!characterStack.isEmpty()){
            if( characterStack.peek() == '('){
                return "Invalid Exp..";
            }
            result += characterStack.pop();
        }

        return result;
    }

    public int Prec(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}

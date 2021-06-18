package Stack;

import java.util.Stack;

public class InfixEvaluation {

    public int evaluateInfix(String exp){
        char[] tokens = exp.toCharArray();

        Stack<Integer> integerStack = new Stack<Integer>();
        Stack<Character> characterStack = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i] == ' '){
                continue;
            }else if(Character.isDigit(tokens[i])){
                int n = 0;
                char c = tokens[i];
                while(Character.isDigit(c)){
                    n = n *10 + (c - '0');
                    i++;
                    c = tokens[i];
                }
                i--;
                integerStack.push(n);
            }else if(tokens[i] == '('){
                characterStack.push(tokens[i]);
            }else if(tokens[i] == ')'){
                while (characterStack.peek() != ')'){
                    integerStack.push(apply(characterStack.pop(), integerStack.pop(), integerStack.pop()));
                }
                characterStack.pop();
            }else if( tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){
                while(!characterStack.isEmpty() && hasPrecedence(tokens[i], characterStack.peek())){
                    integerStack.push(apply(characterStack.pop(), integerStack.pop(), integerStack.pop()));
                }
                characterStack.push(tokens[i]);
            }
        }

        while(!characterStack.isEmpty()){
            integerStack.push(apply(characterStack.pop(), integerStack.pop(), integerStack.pop()));
        }

        return integerStack.pop();
    }

    private boolean hasPrecedence(char token, Character peek) {
        if(peek == '(' || peek == ')'){
            return false;
        }

        if( (token == '*'|| token == '/') && (peek == '+'|| peek == '-')){
            return false;
        }
        return true;
    }

    private Integer apply(Character pop, Integer val1, Integer val2) {

        switch (pop){
            case '+':  return val2+val1;
            case '-': return val2-val1;
            case '*': return val2*val1;
            case '/': return val2/val1;
        }
        return 0;
    }


}

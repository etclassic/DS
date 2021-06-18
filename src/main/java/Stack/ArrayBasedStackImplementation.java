package Stack;

public class ArrayBasedStackImplementation {

    static final int MAX = 100;
    int top;
    int a[] = new int[MAX];

    ArrayBasedStackImplementation(){
        top = -1;
    }

    public boolean push(int x){
        if(top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }

        a[++top] = x;
        System.out.println(x + " pushed into stack");
        return true;
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        int x = a[top--];
        System.out.println(x + " popped from stack");
        return  x;
    }


}

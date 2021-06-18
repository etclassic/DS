package Stack;

public class DynamicArrayBasedStackImplementation {

    static final int BOUND = 4;
    int top = -1;
    int length = 0;

    public int[] createStack(int[] arr){
        int[] arr_new = new int[BOUND+length];

        for(int i = 0; i < arr.length; i++){
            arr_new[i] = arr[i];
        }
        length = length+BOUND;
        return arr_new;
    }

    public int[] push(int[] arr, int data){
        if(top == length-1){
            System.out.println("Stack Overflow, extending the size");
            int new_arr[] = createStack(arr);
            new_arr[++top] = data;
            System.out.println(data + " is pushed into the stack");
            return new_arr;
        }else{
            arr[++top] = data;
            System.out.println(data + " is pushed into the stack");
        }
        return arr;
    }

    public int pop(int[] arr){
        int x = 0;
        if(top == -1){
            System.out.println("Stack underFlow");
        }else{
             x = arr[top--];
            System.out.println(x + " is popped into the stack");
        }
        return x;
    }
}

package Stack;

public class LinkedListBasedStackImplementation {

    StackNode root;

    class StackNode{
        int data;
        StackNode next;

        StackNode(int data){
            this.data = data;
        }
    }

    public void push(int data){

        StackNode stackNode = new StackNode(data);
        if(root == null){
            root =  stackNode;
        }else{
            StackNode temp  = root;
            root = stackNode;
            stackNode.next = temp;
        }

        System.out.println(data + " pushed to stack");
    }

    public int pop(){
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = root.data;
            root = root.next;
            return x;
        }
    }
}

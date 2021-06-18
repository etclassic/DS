package Queue;

public class ArrayBasedQueueImplementation {

    int front, rear,size;
    int capacity;
    int arr[];

    ArrayBasedQueueImplementation(int capacity){
        this.capacity = capacity;
        this.front = -1;
        this.size = 0;
        this.rear = -1;
        this.arr = new int[this.capacity];
    }

    boolean isFull(){
        return this.size == this.capacity ? true : false;
    }

    boolean isEmpty(){
        return this.size == 0 ? true : false;
    }

    public void enQueue(int data){

        if (isFull()) {
            System.out.println("Queue is full...");
            return;
        }

        if(this.front == -1){
            this.front++;
        }
        this.rear = this.rear + 1;
        this.size = this.size + 1;
        this.arr[this.rear] = data;
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty...");
            return 0;
        }

        int x = this.arr[this.front];

        this.front = this.front + 1;
        if(this.front == -1){
            this.rear = this.front;
        }

        this.size = this.size - 1;
        return x;
    }
}

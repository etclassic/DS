package Queue;

public class LinkedListBasedQueueImplementation {

    QueueNode rear,front;

    LinkedListBasedQueueImplementation(){
        this.rear = this.front = null;
    }

    public void enQueue(int data){

        QueueNode new_node = new QueueNode(data);

        if(this.front == null){
            this.front = this.rear = new_node;
        }

        this.rear.next = new_node;
        this.rear = new_node;
    }

    public int deQueue(){

        if(this.front == null){
            System.out.println("Queue is empty...");
            return 0 ;
        }

        int x =  this.front.data;
        this.front = this.front.next;
        if(this.front == null){
            this.rear = null;
        }

        return x;
    }
}

class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data){
        this.data = data;
        this.next = null;
    }
}
package Stack;

import java.util.EmptyStackException;

public class KStacksUsingSingleArray {

    int arr[];
    int top[];
    int next[];
    int n,k,free;

    KStacksUsingSingleArray(int n1, int k1){
        n = n1;
        k = k1;
        free = 0 ;

        arr = new int[n];
        next = new int[n];
        top = new int[k];

        for (int i = 0; i < n-1; i++) {
            next[i] = i+1;
        }

        next[n-1] = -1;

        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
    }

    public boolean isFull(){
        return (free == -1);
    }

    public boolean isEmpty(int stackId){
        return (top[stackId] == -1);
    }

    public void push(int data, int stackId){

        if(isFull()){
           throw new StackOverflowError();
        }

        int i = free;
        free = next[i];
        next[i] = top[stackId];
        top[stackId] = i;
        arr[i] = data;


    }

    public int pop(int stackId){
        if(isEmpty(stackId)){
            throw new EmptyStackException();
        }

        int i = top[stackId];
        top[stackId] = next[i];
        next[i] = free;
        free = i;
        return arr[i];
    }
}

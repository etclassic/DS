package Stack;

import java.util.EmptyStackException;

public class TwoStacksUsingSingleArray {

    int arr[];
    int top1, top2;
    int size;

    TwoStacksUsingSingleArray(int n){
        arr = new int[n];
        top1 = -1;
        top2 = n;
        size = n;
    }

    public void push1(int data){

        if(top1 < top2-1){
            top1++;
            arr[top1] = data;
        }else {
            throw new StackOverflowError();
        }
    }

    public void push2(int data){

        if(top1 < top2-1){
            top2--;
            arr[top2] = data;
        }else {
            throw new StackOverflowError();
        }
    }

    public int pop1(){

        int x=0;
        if(top1 > -1){
            x = arr[top1];
            top1--;
        }else {
            throw new EmptyStackException();
        }

        return 0;
    }

    public int pop2(){

        int x=0;
        if(top2 < size){
            x = arr[top2];
            top2++;
            return x;
        }else {
            throw new EmptyStackException();
        }
    }
}

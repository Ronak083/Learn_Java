package Data_Structures.Stack;
public class StackUsingArray {
    int[] arr;
    int topOfStack;
    public StackUsingArray(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created Successfully");
    }

    public boolean isEmpty() {
        if (topOfStack == -1) return true;
        else return false;
    }

    public boolean isFull(){
        if (topOfStack == arr.length-1) return true;
        else return false;
    }

    public void push(int value){

    }

    public void pop(){

    }

    public void Top(){

    }

    public void DeleteStack(){

    }




}

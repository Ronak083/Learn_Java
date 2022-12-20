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
        if (isFull()){
            System.out.println("Stack is Full");
        } else{
            arr[topOfStack+1]= value;
            topOfStack++;
            System.out.println("inserted Successfully");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else{
            int top = arr[topOfStack];
            topOfStack--;
            System.out.println("Pop Successfully");
            return top;
        }
    }

    public int Top(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else return arr[topOfStack];
    }

    public void DeleteStack(){
        arr = null;
        System.out.println("Stack has been deleted successfully");
    }




}

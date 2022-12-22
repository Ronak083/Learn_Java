package Data_Structures.Queue;
public class CircularQueue {
    int[] arr;
    int start;
    int end;
    int size;
    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.start = -1;
        this.end = -1;
        System.out.println("Successfully Created CQ");
    }
    public void enqueue(int value){}
    public void dequeue(){}
    public boolean isEmpty(){return false}
    public boolean isFull(){return false}
    public int top(){
        return arr[start];
    }
    public void delete(){
        arr = null;
        System.out.println("Successfully Deleted Queue");
    }

}

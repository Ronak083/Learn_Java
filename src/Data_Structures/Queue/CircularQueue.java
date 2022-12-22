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
    public void enqueue(int value){
        if (isFull()) System.out.println("Queue is Full");
        else if (isEmpty()) {
            start =0;
            end++;
            arr[end] = value;
            System.out.println("Successfully Inserted");
        }
        else {
            if(end+1== size) end = 0;
            else end++;
            arr[end] = value;
            System.out.println("Successfully Inserted");
        }
    }
    public int dequeue(){
        if (isEmpty()){
            System.out.println("The CQ is Empty");
            return -1;
        } else{
            int result = arr[start];
            arr[start] =0 ;
            if (start == end) start = end = -1;
            else if (start + 1 == size) start = 0;
            else start++;
            return result;
        }
    }
    public boolean isEmpty(){
        if(end == -1) return true;
        return false;
    }
    public boolean isFull(){
        if (end+1 == start) {
            return true;
        }
        else if (start == 0 && end+1 == size){
            return true;
        }
        return false;
    }
    public int top(){
        if (isEmpty()){
            System.out.println("The CQ is Empty");
            return -1;
        } else return arr[start];
    }
    public void delete(){
        arr = null;
        System.out.println("Successfully Deleted Queue");
    }

}

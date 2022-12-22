package Data_Structures.Queue;
public class QueueUsingArray {
    int[] arr;
    int Starting ;
    int Ending;
    public QueueUsingArray(int size){
        this.Starting = -1;
        this.Ending = -1;
        this.arr = new int[size];
        System.out.println("Successfully Queue Created");
    }
    public boolean isEmpty(){
        if((Starting == -1) || (Starting == arr.length)) return true;
        else return false;
    }
    public boolean isFull(){
        if(Ending== arr.length-1){
            return true;
        } else return false;
    }
    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            Starting = 0;
            Ending++;
            arr[Ending] = value;
            System.out.println("Successfully Inserted");
        } else{
            Ending++;
            arr[Ending] = value;
            System.out.println("Successfully Inserted");
        }
    }
    public int top(){
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
            return -1;
        } else{
            return arr[Starting];
        }
    }
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
        } else{
            int result = arr[Starting];
            Starting++;
            if (Starting> Ending){
                Starting = Ending = -1;
                System.out.println("Successfully remove " +result);
            }
        }
    }
    public void delete(){
        arr = null;
        System.out.println("Successfully Deleted Queue");
    }
}

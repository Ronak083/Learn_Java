package Data_Structures.Queue;
import

public class QueueUsingLL {
    SinglyLinkedList ll;
    public QueueUsingLL(int size){
        ll = new SinglyLinkedList();
        System.out.println("Successfully Created Queue");
    }
    public boolean isEmpty(){
        if (ll.head == null) return true;
        return false;
    }
    public void enqueue(int value){
        ll.insert(value);
        System.out.println("Successfully Inserted");
    }
    public int dequeue(){}

}

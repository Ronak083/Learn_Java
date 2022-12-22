package Data_Structures.Queue;

public class QueueUsingLL {
    SinglyLinkedList ll;
    public QueueUsingLL(){
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
    public int dequeue(){
        if (isEmpty()){
            System.out.println("The queue is Empty");
            return -1;
        } else{
            int result = ll.head.value;
            ll.Delete(0);
            return result;
        }
    }
    public int top() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        } else {
            int result = ll.head.value;
            return result;
        }

    }
    public void delQueue () {
        ll.head = null;
        ll.tail = null;
    }
}

package Data_Structures.Queue;

public class main {
    public static void main(String[] args) {
        QueueUsingArray myqueue = new QueueUsingArray(5);
        myqueue.enqueue(0);
        myqueue.enqueue(1);
        myqueue.enqueue(2);
        myqueue.enqueue(3);
        myqueue.enqueue(4);
        myqueue.enqueue(5);
        myqueue.enqueue(6);
        boolean result = myqueue.isEmpty();
        System.out.println(result);
        result = myqueue.isFull();
        System.out.println(result);
        myqueue.dequeue();
        int nas = myqueue.top();
        System.out.println(nas);
        myqueue.delete();


    }
}

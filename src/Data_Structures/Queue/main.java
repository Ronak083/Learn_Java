package Data_Structures.Queue;

public class main {
    public static void main(String[] args) {
        QueueUsingArray myqueue = new QueueUsingArray(5);
        myqueue.enqueue(4);
        myqueue.enqueue(4);myqueue.enqueue(4);
        myqueue.enqueue(4);myqueue.enqueue(4);
        myqueue.enqueue(4);myqueue.enqueue(4);
        boolean result = myqueue.isEmpty();
        System.out.println(result);
        result = myqueue.isFull();
        System.out.println(result);
        myqueue.dequeue();
        int nas = myqueue.top();
        System.out.println(nas);


    }
}

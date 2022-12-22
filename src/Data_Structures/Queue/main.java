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

        System.out.println(myqueue.isEmpty());
        System.out.println(myqueue.isFull());
        myqueue.dequeue();
        System.out.println(myqueue.top());
        myqueue.delete();

        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq.dequeue());
        System.out.println(cq.top());
        cq.delete();

        QueueUsingLL lq = new QueueUsingLL();

        lq.enqueue(1);
        lq.enqueue(2);lq.enqueue(3);
        lq.delQueue();

    }
}

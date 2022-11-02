package Data_Structures.LinkedList;
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node CreateSLL(int value){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        return head;
    }
    public void insertSll(int location, int value){
        Node node = new Node();
        node.value = value;
        if (head == null) {
            CreateSLL(value);
            return;
        } else if(location == 0){
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempnode = head;
            int index =0;
            while (index<location-1){
                tempnode = tempnode.next;
                index++;
            }
            Node nextnode = tempnode.next;
            tempnode.next = node;
            node.next = nextnode;
            }
        size++;
    }
}

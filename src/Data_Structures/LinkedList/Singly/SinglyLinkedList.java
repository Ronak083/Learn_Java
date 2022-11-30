package Data_Structures.LinkedList.Singly;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node Create(int value){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        return head;
    }
    public void insert(int location, int value){
        Node node = new Node();
        node.value = value;
        if (head == null) {
            Create(value);
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
    public void traverse(){
        Node temp = head;
        for (int i =0;i<=size;i++){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

}

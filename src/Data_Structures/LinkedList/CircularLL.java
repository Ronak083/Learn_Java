package Data_Structures.LinkedList;
public class CircularLL {
    public Node head;
    public Node tail;
    public int size;
    public void createcll(int value){
        head = new Node();
        Node temp = new Node();
        temp.value = value;
        temp.next = temp;
        head = temp;
        tail = temp;
        size = 1;
    }
    public void insert(int value){
        if (head == null){
            createcll(value);
        }
        else{
            Node node = new Node();
            node.value = value;
            node.next = head;
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public void insert(int location, int value){}
    public void traverse(){
        if (head == null){
            return;
        }
        Node temp = new Node();
        temp = head;
        while (temp.next != head){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print(temp.value + "->");
    }
    public void search(int value){}
    public void delete(int location){}
    public void deleteCll(
    head = null;
    tail = null;
    ){}
}

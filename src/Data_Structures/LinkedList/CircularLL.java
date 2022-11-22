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
    public void insert(int location, int value){

        if (head == null){
            createcll(value);
            return;
        }
        Node node = new Node();
        node.value = value;
        if (location == 0) {
            node.next = head;
            tail.next = node;
            head = node;
        } else if (location >= size) {
           node.next = head;
           tail.next = node;
           tail = node;
        } else {
            Node temp = head;
            int index = 0;
            while (index<location-1){
                temp = temp.next;
                index++;
            }
            Node next = temp.next;
            temp.next = node;
            node.next = next;
        }
        size++;

    }
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
        System.out.print(temp.value + "\n");
    }
    public void search(int value){
        if(head != null){
            Node temp = head;
            for (int i =0; i<size;i++){
                if(temp.value == value){
                    System.out.println("Found Successfully "+ value+" at location " + i + "\n");
                    return;
                }
                temp= temp.next;
            }
            System.out.println("Node not found " + value +"\n");
            return;
        }
    }
    public void delete(int location){


    }
    public void deleteCll() {
        head = null;
        tail = null;
        System.out.println( "List deleted successfully\n");
    }

}

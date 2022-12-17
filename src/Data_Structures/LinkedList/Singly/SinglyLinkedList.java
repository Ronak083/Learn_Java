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
        size = 1;
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
        for (int i =0;i<size;i++){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
    public boolean SearchNode(int value){
        if (head != null){
            Node temp = head;
            for (int i =0 ; i<size;i++){
                if (temp.value == value){
                    System.out.println("\n Value found");
                    return true;
                }
            }
        }
        System.out.println("Node not found");
        return false;
    }
    public void Delete(int location){
        if (head == null){
            System.out.println("No Linked list Exist");
            return;
        } else if (location == 0) {
              head = head.next;
              size--;
              if (size == 0){
                  tail = null;
              }
        } else if (location >= size) {
            Node temp = head;
            for (int  i =0 ; i<size-1;i++){
                temp = temp.next;
            }
            if (temp == head){
                tail = head = null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        } else {
            Node temp = head;
            for (int i =0 ; i<location-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        System.out.println();
    }

    public void DeleteSll(){
        head = null;
        tail= null;
        System.out.println("List deleted successfully");
    }


}

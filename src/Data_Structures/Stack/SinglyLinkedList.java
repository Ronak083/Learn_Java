package Data_Structures.Stack;

import Data_Structures.LinkedList.Node;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Node CreateSll(int value){
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
        if (head == null) {
            CreateSll(value);
            return;
        }
        Node node = new Node();
        node.value = value;
        if(location == 0){
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
    public void insert(int value){
        if (head == null){
            CreateSll(value);
        }
        else{
            Node temp = new Node();
            temp.value = value;
            temp.next = null;
            tail.next = temp;
            tail = temp;
            size++;
        }
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
                    System.out.println("Value found\n");
                    return true;
                }temp = temp.next;

            }
        }
        System.out.println("Node not found\n");
        return false;
    }
    public void Delete(int location){
        if (head == null){
            System.out.println("No Linked list Exist\n");
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
        tail = null;
        System.out.println("List deleted successfully\n");
    }


}

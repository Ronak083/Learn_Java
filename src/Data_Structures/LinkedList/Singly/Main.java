package Data_Structures.LinkedList.Singly;

import Data_Structures.LinkedList.Singly.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
      SinglyLinkedList sll = new SinglyLinkedList();
      sll.Create(5);
      sll.insert(4,5);
        sll.insert(1,1);
        sll.insert(3,2);
        sll.insert(0,3);
        sll.insert(2,4);
        sll.traverse();
        sll.SearchNode(3);
        sll.DeleteSll();
        sll.insert(0,0);
      sll.insert(1,1);
      sll.insert(2,2);
      sll.insert(3,3);
      sll.insert(4,4);
      sll.traverse();
      sll.Delete(2);
      sll.traverse();



        }
}

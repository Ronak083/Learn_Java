package Data_Structures.LinkedList;

public class Main {
    public static void main(String[] args) {
      //SinglyLinkedList sll = new SinglyLinkedList();
      //sll.CreateSll(5);
      //sll.insert(4,5);
      //sll.insert(1,1);
      //sll.insert(3,2);
      //sll.insert(0,3);
      //sll.insert(2,4);
      //sll.traverse();
      //sll.SearchNode(3);
      //sll.DeleteSll();
      //sll.insert(0,0);
      //sll.insert(1,1);
      //sll.insert(2,2);
      //sll.insert(3,3);
      //sll.insert(4,4);
      //sll.insert(5);
      //sll.traverse();
      //sll.Delete(2);
      //sll.traverse();

      CircularLL cll = new CircularLL();
      cll.createcll(1);
      cll.insert(2);
      cll.insert(3);
      cll.insert(5);
      cll.traverse();
      cll.insert(0,0);
      cll.insert(6,6);
      cll.insert(4,4);
      cll.traverse();
      cll.search(5);
      cll.search(7);



        }
}

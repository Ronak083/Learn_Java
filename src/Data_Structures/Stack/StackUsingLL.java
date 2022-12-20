package Data_Structures.Stack;

public class StackUsingLL {
    SinglyLinkedList ll;
    public StackUsingLL(){
        ll = new SinglyLinkedList();
    }
    public boolean isEmpty(){
        if (ll.head == null) return true;
        return false;
    }
    public void push(int value){
        ll.insert(value);
        System.out.println("inserted Successfully");
    }
    public void pop(){
        if (ll.head==null){
            System.out.println("Stack is Empty");
        }else {
            ll.Delete(0);
            System.out.println("Pop Successfully");
        }
    }
    public int top(){
        if (ll.head==null){
            System.out.println("Stack is Empty");
            return -1;
        }else {
            return ll.head.value;
        }
    }
    public void delete(){
        ll.head = null;
    }

}

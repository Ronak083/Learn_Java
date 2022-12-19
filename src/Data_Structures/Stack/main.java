package Data_Structures.Stack;

public class main {
    public static void main(String[] args) {
        StackUsingArray myStack = new StackUsingArray(5);
        boolean result = myStack.isEmpty();
        boolean result2 = myStack.isFull();
        System.out.println("IsEmpty = " + result + " IsFull = " + result2);
    }

}

package Data_Structures.BinaryTree;

public class BinaryTreeArray {
    String[] arr;
    int lastusedIndex;
    public BinaryTreeArray(int size){
        arr = new String[size+1];
        this.lastusedIndex = 0;
        System.out.println("Blank tree has been Created");
    }

    boolean isFull(){
        if (arr.length-1 == lastusedIndex){
            return true;
        } else return false;
    }

    void insert(String value){
        if (!isFull()){
            arr[lastusedIndex+1] = value;
            lastusedIndex++;
            System.out.println("Node Inserted successfully");
        }else System.out.println("The BT is full");
    }
}

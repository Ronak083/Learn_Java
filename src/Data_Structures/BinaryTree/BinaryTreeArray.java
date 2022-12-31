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
    void preorder(int index){
        if(index> lastusedIndex) return;
        System.out.print(arr[index] + " ");
        preorder(index*2);
        preorder(index*2 + 1);
    }
    void Inorder(int index) {
        if (index > lastusedIndex) return;
        Inorder(index*2);
        System.out.print(arr[index] + " ");
        Inorder(index*2 + 1);
    }
    void postorder(int index) {
        if (index > lastusedIndex) return;
        postorder(index*2);
        postorder(index*2 + 1);
        System.out.print(arr[index] + " ");
    }
    void levelorder(int index){
        for (int i =1;i<=lastusedIndex;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public int search(String value){
        for (int i =1;i<=lastusedIndex;i++){
            if(arr[i] == value){
                System.out.print("value found at " + i);
                return i;
            }
        }
        System.out.print("value not found");
        return -1;
    }
}

package Data_Structures.AVL;
public class main {
    public static void main(String[] args) {
        AVLtree avl = new AVLtree();
        avl.insert(5);
        avl.insert(2);
        avl.insert(7);
        avl.insert(9);
        avl.insert(1);
        avl.levelorder();
    }

}

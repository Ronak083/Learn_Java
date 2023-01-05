package Data_Structures.BST;

public class main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(62);
        bst.insert(23);
        bst.insert(65);
        bst.insert(21);
        bst.insert(4);
        bst.insert(6);
        System.out.println();
        bst.postorder(bst.root);
        System.out.println();
        bst.preorder(bst.root);
        System.out.println();
        bst.inorder(bst.root);
        System.out.println();
        bst.levelorder();

        System.out.println();
        bst.Search(bst.root, 6);
        //bst.deleteNode(bst.root, 6);

        System.out.println();
        bst.deleteBST();

    }
}

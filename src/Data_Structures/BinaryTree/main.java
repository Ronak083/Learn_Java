package Data_Structures.BinaryTree;

import Data_Structures.BinaryTree.BinaryNode;
import Data_Structures.BinaryTree.BinaryTreeLL;

public class main {
    public static void main(String[] args) {
        //BinaryTreeLL bt = new BinaryTreeLL();
        //BinaryNode n1 = new BinaryNode();
        //n1.value = "n1";
        //BinaryNode n2 = new BinaryNode();
        //n2.value = "n2";
        //BinaryNode n3 = new BinaryNode();
        //n3.value = "n3";
        //BinaryNode n4 = new BinaryNode();
        //n4.value = "n4";
        //BinaryNode n5 = new BinaryNode();
        //n5.value = "n5";
        //BinaryNode n6 = new BinaryNode();
        //n6.value = "n6";
        //BinaryNode n7 = new BinaryNode();
        //n7.value = "n7";
        //BinaryNode n8 = new BinaryNode();
        //n8.value = "n8";
        //BinaryNode n9 = new BinaryNode();
        //n9.value = "n9";
        
        //n1.left = n2;
        //n1.right = n3;
        //n2.left = n4;
        //n2.right = n5;
        //n4.left = n8;
        //n4.right = n9;
        //n3.left = n6;
        //n3.right = n7;

        //bt.root = n1;
        //bt.preOrder(bt.root);
        //System.out.print("\n");
        //bt.inOrder(bt.root);
        //System.out.print("\n");
        //bt.postOrder(bt.root);
        //System.out.print("\n");
        //bt.levelOrder(bt.root);
        //System.out.print("\n");
        //bt.search("n5");

        //bt.insert("n1");
        //bt.insert("n2");
        //bt.insert("n3");
        //bt.insert("n4");
        //bt.insert("n5");
        //bt.insert("n6");
        //bt.insert("n7");
        //bt.insert("n8");
        ////System.out.println(bt.getDeepestNode().value);
        //bt.levelOrder(bt.root);
        //System.out.println();
        //bt.deleteNode("n3");
        //bt.levelOrder(bt.root);

        BinaryTreeArray bta = new BinaryTreeArray(5);
        bta.insert("1");
        bta.insert("2");
        bta.insert("3");
        bta.insert("4");
        bta.insert("5");
        bta.preorder(1);

        System.out.println();
        bta.Inorder(1);

        System.out.println();
        bta.postorder(1);

        System.out.println();
        bta.levelorder(1);

        System.out.println();
        bta.search("4");
        
        System.out.println();
        bta.delete("5");

        System.out.println();
        bta.DeleteBT();

    }
}
package Data_Structures.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;
    BinarySearchTree(){
        root = null;
    }
    private BinaryNode insert(BinaryNode node, int value){
        if(node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value successfully Inserted");
            return newNode;
        } else if (value <= node.value) {
            node.left = insert(node.left , value);
            return node;
        } else{
            node.right = insert(node.right , value);
            return node;
        }
    }
    void insert(int value){
        root = insert(root,value);
    }
    void preorder(BinaryNode node){
        if (node==null) {return;}
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(BinaryNode node){
        if (node==null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
    void postorder(BinaryNode node){
        if (node==null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
    void levelorder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right  );
            }
        }
    }
    BinaryNode Search(BinaryNode node, int value){
        if (node ==null) {
            System.out.print("Node not found");
            return null;
        } else if (node.value==value) {
            System.out.print("Value "+ value +" found in BST");
            return node;
        } else if (value < node.value) {
            return Search(node.left, value);
        } else{
            return Search(node.right, value);
        }
    }
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }
    /*public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
    }*/

    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}

package Data_Structures.AVL;

import java.util.LinkedList;
import java.util.Queue;

public class AVLtree {
    BinaryNode root;
    AVLtree(){
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
    void preorder(BinaryNode node){
        if (node==null) return;
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
    
    public int getHeight(BinaryNode node){
        if (node==null){
            return 0;
        }
        return node.height;
    }
    private BinaryNode rotateright(BinaryNode disBlalancedNode){
        BinaryNode newRoot = disBlalancedNode.left;
        disBlalancedNode.left = disBlalancedNode.left.right;
        newRoot .right = disBlalancedNode;
        disBlalancedNode.height = 1 + Math.max(getHeight(disBlalancedNode.left), getHeight(disBlalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }
    private BinaryNode rotateleft(BinaryNode disBlalancedNode){
        BinaryNode newRoot = disBlalancedNode.right;
        disBlalancedNode.right = disBlalancedNode.right.left;
        newRoot.left = disBlalancedNode;
        disBlalancedNode.height = 1 + Math.max(getHeight(disBlalancedNode.left), getHeight(disBlalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }
    public int getBalance(BinaryNode node){
        if (node==null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }
    private BinaryNode insertNode(BinaryNode node, int nodeValue){
        if (node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue< node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else{
            node.right = insertNode(node.right , nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left) , getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value){
            return rotateright(node);
        }

        if(balance > 1 && nodeValue > node.left.value){
            node.left = rotateleft(node.left);
            return rotateright(node);
        }

        if(balance < -1 && nodeValue > node.right.value){
            return rotateleft(node);
        }
        if(balance < -1 && nodeValue < node.right.value){
            node.right = rotateleft(node.right);
            return rotateleft(node);
        }
        return node;
    }
    public void insert(int value) {
        root = insertNode(root, value);
    }
    public static BinaryNode minimum(BinaryNode root){
        if (root.left == null){
            return root;
        }
        return minimum(root.left);
    }
    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value not found in AVL");
            return node;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left != null && node.right != null) {
                BinaryNode temp = node;
                BinaryNode minNodeForRight = minimum(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }
        // Case 2 - rotation required

        // System.out.println("1");
        // System.out.println(previous.value);

        // node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateright(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateleft(node.left);
            return rotateright(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateleft(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateright(node.right);
            return rotateleft(node);
        }
        return node;
    }
    public void delete(int value) {
        root = deleteNode(root, value);
    }
    public void deleteAVL() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}

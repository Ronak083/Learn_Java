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
    void insert(int value){
        root = insert(root,value);
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
    public int getBlalanced(BinaryNode node){
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
            
        }
    }
    
    

    public void deleteAVL() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}

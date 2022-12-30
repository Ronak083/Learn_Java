package Data_Structures.BinaryTree;
import java.lang.invoke.StringConcatFactory;
import java.util.Queue;
import java.util.LinkedList;
import java.util.function.IntBinaryOperator;

public class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL(){
        this.root = null;
    }
    void preOrder(BinaryNode node){
        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
    void inOrder(BinaryNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    void postOrder(BinaryNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
    void levelOrder(BinaryNode node){
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
    void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value){
                System.out.println("The Value-" + value+" is found in Tree");
                return;
            }
            else{
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }

                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }

        }
        System.out.println("The value Not Found");
    }
    void insert(String value){
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null){
            root = node;
            System.out.println("Inserted new node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null){
                presentNode.left = node;
                System.out.println("Inserted new node");
                break;
            } else if (presentNode.right == null){
                presentNode.right = node;
                System.out.println("Inserted new node");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if (presentNode.left != null){
                queue.add(presentNode.left);
            }
            if (presentNode.right != null){
                queue.add(presentNode.right);
            }

        }
        return presentNode;
    }
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
            previousNode.right = null;
            return;
            } else if(presentNode.right == null){
                presentNode.left = null;
                return   ;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The Node Deleted Successfully");
                return;
            } else{
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("The Node not found");
    }

}

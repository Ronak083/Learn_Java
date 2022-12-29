package Data_Structures.BinaryTree;
import java.util.Queue;
import java.util.LinkedList;

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

}

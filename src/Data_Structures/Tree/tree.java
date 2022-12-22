package Data_Structures.Tree;
import java.util.ArrayList;

public class tree {
 String data;
 ArrayList<tree> children;
 public tree(String data){
  this.data = data;
  this.children = new ArrayList<tree>();
 }

 public void addChild(tree node){
  this.children.add(node);
 }

 public String print(int level){
  String ret;
  ret = " ".repeat(level)+data+"\n";

  for (tree node : this.children){
   ret += node.print(level+1);
  }
  return ret;
 }



}


import java.util.ArrayList;

public class printPath {
  static class Node {
      int data;
      Node left;
      Node right;
      Node(int val) {
          this.data = val;
      }
  }
  public static Node insert(Node root, int val) {
      if (root == null) {
          root = new Node(val);
          return root;
      }
      if (val < root.data) {
          root.left = insert(root.left, val);
      } else {
          root.right = insert(root.right, val);
      }
      return root;
  }
  public static void inorder(Node root){
    if(root==null){
      return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }
  public static void printhPath(ArrayList<Integer> path){
    for (int i=0; i<path.size();i++) {
        System.out.print(path.get(i)+" -> ");
    }
    System.out.println("Null");
  }
  public static void printRootTwoLeaf(Node root,ArrayList<Integer> path){
    if(root==null){
      return;
    }
    path.add(root.data);
    if(root.left==null && root.right==null){
      printhPath(path);
    }
    printRootTwoLeaf(root.left, path);
    printRootTwoLeaf(root.right, path);
    path.remove(path.size()-1);
  }
  public static void main(String[] args) {
      int values[] = {4, 5, 6, 3, 2, 1};
      Node root = null;
      for(int i=0;i<values.length;i++){
        root = insert(root, values[i]); 
      }
      // inorder(root);
      System.out.println("");
      ArrayList<Integer> path = new ArrayList<>();
      printRootTwoLeaf(root, path);
  }
}

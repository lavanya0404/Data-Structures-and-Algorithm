public class validBST {
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
  public static boolean isValid(Node root, Node min, Node max)
  {
    if(root == null){return true;}
    if(min!=null && min.data>=root.data)
    {
      return false;
    }
    if(max!=null && max.data<=root.data)
    {
      return false;
    }
    return isValid(root.left, min, root) && isValid(root.right, root, max);
  }

  public static void main(String[] args) {
      int values[] = {4, 5, 6, 3, 2, 1};
      Node root = null;
      for(int i=0;i<values.length;i++){
        root = insert(root, values[i]); 
      }
      inorder(root);
      System.out.println("");
      if(isValid(root, null, null))
      {
        System.out.println("Valid");
      }else{
        System.out.println("Not Valid");
      }
  }
}

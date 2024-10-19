public class inRangeOfK {
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
  public static void inRange(Node root,int k1,int k2 )
  {
    if(root==null){
      return;
    }
    if(root.data>=k1 && root.data<=k2)
    {
      inRange(root.left, k1, k2);
      System.out.println(root.data+" ");
      inRange(root.right, k1, k2);
    }
    if(root.data<k1){
      inRange(root.left, k1, k2);
    }
    if(root.data>k2){
      inRange(root.right, k1, k2);
    }
  }

  public static void main(String[] args) {
      int values[] = {4, 5, 6, 3, 2, 1};
      Node root = null;
      for(int i=0;i<values.length;i++){
        root = insert(root, values[i]);
        
      }
      inorder(root);
      System.out.println("");
      inRange(root, 2, 6);
  }

}

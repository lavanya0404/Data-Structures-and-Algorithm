public class DiameterOfTree {
    static class Node {  
      int data;
      Node left;
      Node right;
        Node(int data) {
          this.data = data;
          this.left = null;
          this.right = null;
      }
  }
    static int idx = -1;
    static class BinaryTree{
    public static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
      }
      public static int heightOfTree(Node root) {
        if(root==null)
          return 0;
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        int height = Math.max(lh,rh)+1;
        return height;
      }
      public static int diameterOfTree(Node root) {
        if(root == null)
          return 0;
        int ld = diameterOfTree(root.left);
        int lh = heightOfTree(root.left);
        int rd = diameterOfTree(root.right);
        int rh = heightOfTree(root.right);
        int selfDia = lh+rh+1;
        int dia = Math.max(selfDia,Math.max(ld, rd));
        return dia;
      }  
    }
    public static void main(String[] args) {
      int[] nodes = {1, 2, 4,4,-1,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
      BinaryTree tree = new BinaryTree();
      Node root = tree.buildTree(nodes);
      System.out.println(tree.diameterOfTree(root));
      
    }
  }
  
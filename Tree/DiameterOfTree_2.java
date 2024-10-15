
public class DiameterOfTree_2 {

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
   
        
        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }
       static class Info {

        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root)
    {
      if(root == null)
      {
        return new Info(0, 0);
      }
       Info leftInfo = diameter(root.left);
       Info rightInfo = diameter(root.right);
       int dia = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
       int height = Math.max(leftInfo.ht, rightInfo.ht);
       return new Info(dia, height);
    }

    public static void main(String[] args) {
        // int[] nodes = {1, 2, 4, 4, -1, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
      //diameter(root);
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
System.out.println(diameter(root).diam);
    }
}

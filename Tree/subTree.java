

public class subTree {

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

    static class BinaryTree {

        static int idx = -1;

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
    public static boolean isIdentical(Node node,Node subRoot)
        {
          if(node==null && subRoot==null)
            return true;
          else if(node==null || subRoot == null || node.data!=subRoot.data)
          {
            return false;
          }
          if(!isIdentical(node.left, subRoot.left)){
            return false;
          }
          if(!isIdentical(node.right, subRoot.right)){
            return false;
          }
          return true;
        }
    public static boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree node = new BinaryTree();
        Node root = node.buildTree(nodes);
        System.out.println(root.data);

        Node subRoot = new Node(5);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(6);
        System.out.println(subRoot.data);
        System.out.println(node.isSubTree(root,subRoot));

    }
}

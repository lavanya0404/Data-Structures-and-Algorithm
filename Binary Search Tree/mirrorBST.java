
public class mirrorBST {

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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node mirrorNode(Node root) {
        if (root == null) {
            return null;
        }
        Node leftRoot = mirrorNode(root.left);
        Node rightRoot = mirrorNode(root.right);
        root.left = rightRoot;
        root.right = leftRoot;
        return root;
    }

    public static void main(String[] args) {
        int values[] = {4, 5, 6, 3, 2, 1};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println("");
        Node reverseRoot = mirrorNode(root);
        inorder(reverseRoot); 
    }


}

public class deleteInBST {
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
    public static boolean  searchInBST(Node root,int key){
      if(root==null){
         return false;
      }
      if(root.data == key){
        return true;
      }
      if(root.data > key){
        return searchInBST(root.left, key);
      } else{
        return searchInBST(root.right, key);
      }
    }
    public static Node deleteInBST(Node root,int key)
    {
      if(root.data<key){
        root.right = deleteInBST(root.right, key);
      }
      else if(root.data>key){
        root.left = deleteInBST(root.left, key);
      }
      
else{
       if(root.left==null && root.right==null){
        return null;
       }
       if(root.left==null){
        return root.right;
       }
       else if(root.right==null){
        return root.left;
       }
       Node IS = findInorderSuccessor(root.right);
       root.data = IS.data;
       root.right=deleteInBST(root.right, IS.data);
      }
       return root;
    }

    public static Node findInorderSuccessor(Node root)
    {
      while(root.left!=null){
        root = root.left;
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
  
    public static void main(String[] args) {
        int values[] = {8,5,10,11,14,6,7};
        Node root = null;
        for(int i=0;i<values.length;i++){
          root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println("");
        Node delete = deleteInBST(root, 10);
        inorder(delete);
    }
    
}

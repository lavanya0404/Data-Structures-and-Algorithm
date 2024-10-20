class CreateBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
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
    public static Node createBST(Node root, int st, int end)
    {
      if(st>end){
        return null;
      }
      int mid = (st+end)/2;
      Node ele = new Node(mid);
      ele.left = createBST(ele, st, mid-1);
      ele.right = createBST(ele, mid+1, end);
      return ele;
    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 6, 8, 10, 11};
        Node root = null;
        for(int i=0;i<arr.length;i++){
          root = insert(root, arr[i]);
        }
        System.out.println(heightOfTree(root));
        Node secRoot = createBST(root, 0, arr.length-1);
        System.out.println(heightOfTree(secRoot));
    }
}

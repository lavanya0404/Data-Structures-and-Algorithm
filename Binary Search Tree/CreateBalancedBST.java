import java.util.ArrayList;

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
    public static Node createBST(ArrayList<Integer> arr, int st, int end)
    {
      if(st>end){
        return null;
      }
      int mid = (st+end)/2;
      Node ele = new Node(arr.get(mid));
      ele.left = createBST(arr, st, mid-1);
      ele.right = createBST(arr, mid+1, end);
      return ele;
    }
    public static void getInorder(Node root,ArrayList<Integer> arr)
    {
        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        // System.out.println(root.data);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static void main(String args[]) {
        int arr[] = {3, 5, 6, 8, 10, 11};
        Node root = null;
        for(int i=0;i<arr.length;i++){
          root = insert(root, arr[i]);
        }
        ArrayList<Integer> array2 = new ArrayList<>();
        getInorder(root, array2);
        Node secRoot = createBST(array2, 0, array2.size()-1);
        System.out.println(heightOfTree(secRoot)+" "+ secRoot.data);
    }
}


public class MergeSortInLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
      Node newNode = new Node(data);
      size++;
      if(head == null){
          head = tail = newNode;
          return;
      }
      newNode.next = head;
      head = newNode;
     }
     public void printData(){
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
      }
      System.out.print("null");
      System.out.println("\nSize of LL "+size+" ");
     }
    public static Node findMid(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node left, Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public  Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    public static void main(String[] args) {
      MergeSortInLL ll = new MergeSortInLL();
      // ll.addFirst(70);
      ll.addFirst(80);
      ll.addFirst(30);
      ll.addFirst(10);
      ll.addFirst(40);
      ll.addFirst(100);
      ll.addFirst(50);
      ll.printData();
      ll.head = ll.mergeSort(head);
      ll.printData();
    }

}

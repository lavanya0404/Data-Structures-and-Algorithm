public class ZigZagOfLL {
  
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

  public void zigZag()
  {
    Node mid = findMid(head);
    //second half
    Node curr = mid.next;
    mid.next = null;
    //reverse second half
    Node prev = null;
    Node next ;
    while(curr!=null){
      next = curr.next; 
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL,nextR;
    while(left!=null && right!=null){
      nextL = left.next;
      left.next = right;  
      nextR=right.next;
      right.next=nextL;
      right=nextR;
      left=nextL;
    }
  }
  public static void main(String[] args) {
    ZigZagOfLL ll = new ZigZagOfLL();
    ll.addFirst(70);
    ll.addFirst(80);
    ll.addFirst(30);
    ll.addFirst(10);
    ll.addFirst(40);
    ll.addFirst(100);
    ll.addFirst(50);
    ll.printData();
    ll.zigZag();
    ll.printData();
  }

}



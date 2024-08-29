public class checkPalindrome {
  public class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public  static int size;
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
   public Node findMin(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
   }
   public boolean checkPalindrome(){
    if(head==null||head.next==null)
    {
      return true;
    }
    Node midNode = findMin(head);
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr!=null)
    {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;

    while(right!=null){
      if(left.data!=right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
   }
   public static void main(String[] args) {
       checkPalindrome ll = new checkPalindrome();
       ll.addFirst(10);
       ll.addFirst(20);
       ll.addFirst(30);
       ll.addFirst(20);
       ll.addFirst(10);
      System.out.println(ll.checkPalindrome());
   }
}

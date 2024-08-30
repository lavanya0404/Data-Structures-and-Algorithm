public class RemoveLoopInLL {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static  Node head;
  public static Node tail;
  public  static int size;
  public void addFirst(int data)
  {
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   }
   public static void printData(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.print("null");
    //System.out.println("\nSize of LL "+size+" ");
   } 
   public static boolean detectLoop(){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
        if(slow==fast){
          return true;   
        }
    }
    return false;
   }
   public static void removeLoop()  
   {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
        if(slow==fast){
             cycle = true;
             break;
        } 
    }
    if(cycle==false){
      return;
    }
    
    Node prev=null;  
    slow = head;
      while(slow!=fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
      }
      prev.next = null;
   }
   public static void main(String[] args) {
      head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next = head.next;
       System.out.println(detectLoop());
       removeLoop();
       printData();
       System.out.println("\n"+detectLoop());
   }
}

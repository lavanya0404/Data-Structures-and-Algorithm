public class LinkedList {
  public static class Node{
   int data;
   Node next;
   public Node(int data){
     this.data = data;
     this.next = null;
   }
 }
 public static Node head;
 public static Node tail;
 public void addFirst(int data){
  Node newNode = new Node(data);
  if(head == null){
      head = tail = newNode;
      return;
  }
  newNode.next = head;
  head = newNode;
 }
 public void addLast(int data){
  Node newNode = new Node(data);
  if(head == null){
    head = tail = newNode;
    return;
  }
  tail.next = newNode;
  tail = newNode;
 }
 public void printData(){
  Node temp = head;
  while(temp!=null){
    System.out.println(temp.data+" ");
    temp = temp.next;
  }
 }
 public void insertMiddle(int index,int data){
      Node temp = head;
      int count = 0;
      Node newNode = new Node(data);
      if(index==0){
      addFirst(data);
      return;
      }
      while(count<index-1){
        temp=temp.next;
        count++;
      }
      newNode.next = temp.next;
      temp.next = newNode;
 }
 public static void main(String[] args) {
     LinkedList ll = new LinkedList();
      // ll.head = new Node(1);
      // ll.head.next = new Node(2);
      ll.addFirst(3);
      ll.addFirst(4);
     
      ll.addLast(10);
      ll.addLast(20);
      ll.insertMiddle(3,15);
      ll.printData();
 }
}
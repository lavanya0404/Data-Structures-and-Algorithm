import java.util.Scanner;
public class RemoveNthNode {
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
    public void printData(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    System.out.print("null");
    System.out.println("\nSize of LL "+size+" ");
   }
  public void removeNthNode(int index)
  {
    if(index == size){
     head = head.next;
     size--;
     return;
  
     }
     Node prev = head;
     int idx = size - index;
     int i=1;
    while(i<idx){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    size--;
  }
 
public static void main(String[] args) {
    RemoveNthNode ll = new RemoveNthNode();

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addFirst(17);
        ll.addFirst(20);
        ll.addFirst(8);
        ll.printData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth index to delete :");
        int index  = sc.nextInt();
        ll.removeNthNode(index);
        ll.printData();
   }
  } 

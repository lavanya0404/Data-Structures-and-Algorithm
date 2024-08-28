
import java.util.Scanner;

public class SearchInLL {
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
   public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
   }
   public void insertMiddle(int index,int data){
    Node temp = head;
    int count = 0;
    if(index==0){
    addFirst(data);
    return;
    }
    Node newNode = new Node(data);
    size++;
    while(count<index-1){
      temp=temp.next;
      count++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
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
   
   public int searchElement(int data){
    // if(size==0){
    //   System.out.println("NO VALUES To Search");
    // }
    Node temp = head;
    int count = 0;
    while(temp!=null){
      if(temp.data == data){
        return count+1;
      }
        temp=temp.next;
        count++;
    }
    return -1;
   }
   public static void main(String[] args) {
    SearchInLL ll = new SearchInLL();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(10);
        ll.addLast(20);
        ll.insertMiddle(3,15);

        ll.printData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int element = sc.nextInt();
        int index = ll.searchElement(element);
        if(index == -1){
          System.out.println("Element not found");
        }
        else{
          System.out.println("Element found at "+index);
        }   
   }
  } 

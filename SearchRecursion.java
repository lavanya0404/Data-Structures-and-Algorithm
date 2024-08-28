import java.util.Scanner;

public class SearchRecursion {

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
   public int helper(Node temp,int key){
    if(head== null){
      return  -1;
    }
    if(head.data == key){
      return 0;
    }
    int idx = helper(head.next, key);
    if(idx==-1){
      return -1;
    }
    return idx+1;
   }
   
   public int searchRecur(int data){
    return helper(head,data);

   }
   public static void main(String[] args) {
    SearchRecursion ll = new SearchRecursion();

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(10);
        ll.addLast(20);
        ll.insertMiddle(3,15);

        ll.printData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search:");
        int element = sc.nextInt();
        int index = ll.searchRecur(element);
        if(index == -1){
          System.out.println("Element not found");
        }
        else{
          System.out.println("Element found at "+index);
        }   
   }
  } 



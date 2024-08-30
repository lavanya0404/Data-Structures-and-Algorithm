import  java.util.LinkedList;
public class ClassRoom {
  public static void main(String[] args) {
      LinkedList<Integer> ll = new LinkedList<>();
      ll.addFirst(20);
      ll.addLast(30);
      ll.addLast(40);
      ll.addFirst(10);
      System.out.println("Original list: " + ll);
      ll.removeFirst();
      ll.removeLast();
      System.out.println("Original list: " + ll);
  }
  
}

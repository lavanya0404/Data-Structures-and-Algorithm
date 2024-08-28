
import java.util.Scanner;

public class charArray {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Hello world");
      String ch;
      System.out.println("Enter name");
      {
        ch = sc.next();
      }
      for (int i = 0; i < ch.length(); i++) {
        System.err.println(ch.charAt(i));
      }
      sc.close();
    }
  }
}

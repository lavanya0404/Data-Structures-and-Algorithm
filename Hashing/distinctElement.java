
import java.util.HashSet;

public class distinctElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 7};
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            set.add(i);
      }
      System.out.println(set.size());
  }
}

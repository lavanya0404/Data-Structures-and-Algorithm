
import java.util.HashMap;

public class largest0SumArray {
  public static void main(String[] args) {
    int[] arr = {15,2,-2,-1,-7,8,9};
    int sum = 0;
    int length=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int j = 0; j < arr.length; j++) {
      sum += arr[j];
      if(map.containsKey(sum))
      {
        length = Math.max(length, j-map.get(sum));
      }
      else{
        map.put(sum, j);
      }
    }
    System.out.print("Length = "+length);
  }
}

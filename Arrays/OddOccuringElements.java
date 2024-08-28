
import java.util.*;

public class OddOccuringElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(10);
        int index = search(list);
        if(index!=-1){
        System.out.println("Element "+ list.get(index)+" found at "+index);
        }
        else{
          System.out.println("Element not found");
        }
    }
    public static int search(ArrayList<Integer> list) {
      int st = 0;
      int end = list.size() - 1;
      int mid;
      while (st < end) {
          mid = st + (end - st) / 2;
          if(st==end){
            return st;
          }
          if (mid % 2 == 0) {
              if (list.get (mid).equals(list.get(mid + 1))) { 
                  st = mid + 2;
              } else {
                  
                  end = mid;
              }
          } else {
              if (list.get(mid).equals(list.get(mid - 1))) {
                  st = mid + 1;
              } else {   
                  end = mid - 1;
              }
          }
      }
      return st; 
    }
}

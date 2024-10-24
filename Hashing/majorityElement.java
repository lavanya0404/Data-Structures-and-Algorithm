
import java.util.*;

public class majorityElement {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int idx = 0; idx < arr.length; idx++) {
            /*  if (hm.containsKey(arr[idx])) {
                hm.put(arr[idx], hm.get(arr[idx]) + 1);
            } else {
                hm.put(arr[idx], 1);
            } 
             */
            hm.put(arr[idx], hm.getOrDefault(arr[idx], 0) + 1);
        }
         /* Set < Integer > keySet = hm.keySet();
        for (Integer key : keySet) {
            if (hm.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }*/
      for(Integer key:hm.keySet()){
        if(hm.get(key)>arr.length/3){
          System.out.println(key);
        }
      }
    }
}

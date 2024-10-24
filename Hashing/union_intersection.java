
import java.util.HashSet;

public class union_intersection {

    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int idx = 0; idx < arr1.length; idx++) {
            set.add(arr1[idx]);
        }
        for (int idx = 0; idx < arr2.length; idx++) {
            set.add(arr2[idx]);
        }
        return set.size();
    }
    public static int intersection(int[] arr1, int[] arr2){
      HashSet<Integer> set = new HashSet<>();
      int count = 0;
      for (int idx = 0; idx < arr1.length; idx++) {
        set.add(arr1[idx]);
    }
    for (int idx = 0; idx < arr2.length; idx++) {
       if(set.contains(arr2[idx])){
        count++;
        set.remove(arr2[idx]);
       }        
    }
    return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9, 9};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 9, 9};
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}

import java.util.*;
public class Search {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // int arr[]= {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 20; i += 2) {
            arr.add(i);
        }
        int target = 4;
        System.out.print(arr);
        int st = 0;
        int end = arr.size()-1;
        System.out.println("st "+st+" end "+end);
        int mid = (st+end)/ 2;
        while (st <= end) {
            // System.err.println(mid+" ");
            if (target == arr.get(mid)) {
                System.out.println("Element found at "+(mid+1));
                break;
            } 
            else if (arr.get(mid) < target) {
                st = mid+1;
            } 
            else {
                end = mid-1;
            }
            mid = (st+end)/ 2;
        }
    }
}

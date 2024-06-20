
import java.util.*;

public class searchInNearlySortedArray {

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int st = 0;
        int end = list.size() - 1;
        int mid ;
        while (st <=end) {
            mid = st + (end - st) / 2;
            if ( list.get(mid) == target) {
                return mid;
            }
            if (mid > st && list.get(mid - 1) == target) {
                return mid - 1;
            }
            if (mid < end && list.get(mid + 1) == target) {
                return mid + 1;
            } 
            if (list.get(mid) < target) {
                st = mid + 2;
            } else { 
                end = mid - 2;
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(40);
        list.add(20);
        list.add(60);
        list.add(70);
        list.add(80);
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.println("Enter number to search");
            int target = scanner.nextInt();
            System.out.println((binarySearch(list, target))+1);
        }
    }
}

import java.util.*;
public class FirstOccur {
      public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // int arr[]= {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i ++) {
          if((i&1)==0){
            // to add all even numbers into array
            arr.add(i);
          }
            arr.add(i);
        }
        int target = 4;
        
       System.out.println(binarySearch(arr, target));
      }
public static int binarySearch(ArrayList <Integer> arr,int target){
  int st=0;
  int end=arr.size()-1;
  int mid = (st+end)/ 2;
  int index=-1;
  while (st <= end) {
      if (target == arr.get(mid)) {
          index=mid;
          end = mid-1;
      } 
      else if (arr.get(mid) < target) {
        st=mid+1;
      } 
      else {
        end=mid-1;
  }
      mid = (st+end)/ 2;
  }
  return index;
}
}



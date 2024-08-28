import java.util.*;
public class FirstOccurence {
      public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // int arr[]= {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i ++) {
          if((i&1)==0){
            arr.add(i);
          }
            arr.add(i);
        }
        int target = 4;
        // System.out.print(arr);
       System.out.println(binarySearch(arr, target,0,arr.size()-1)+" ");
      }
public static int binarySearch(ArrayList <Integer> arr,int target,int st,int end){
  if(st>end){
    return -1;
  }
  //System.out.println("st "+st+" end "+end);
  int index=-1;
  if(st<=end){
    int mid = st+(end-st)/ 2;
      // System.err.println(mid+" ");
      if (target == arr.get(mid)) {
          index=mid;
          int left=binarySearch(arr, target, st, mid-1);
          if(left!=-1){
            return left;
          }
          //System.out.println("Element found at "+(index+1));    
      } 
      else{
         return binarySearch(arr, target, mid+1, end);
      } 
     
    }
    return index;
  }

}



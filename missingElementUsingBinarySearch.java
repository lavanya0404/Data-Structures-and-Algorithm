import java.util.*;
public class missingElementUsingBinarySearch {
  public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(8);
      int st=list.get(0);
      int end = list.get(list.size()-1);
      int mid=st+(end-st)/2;
      int index=-1;
      while(st<=end){
        if(mid+1==list.get(mid)){
          index=mid+1;
          // System.out.println(index);
          st=mid+1;
        }
        else {
          end=mid-1;
        }
        mid=st+(end-st)/2;
      }
      System.out.println((index+1)+" ");
  }
}

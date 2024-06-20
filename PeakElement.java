import java.util.*;
public class PeakElement {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(10);
      list.add(4);
      list.add(3);
      list.add(2);
      findPeak(list);
  }
  public static void findPeak(ArrayList<Integer> list) {
    int st=0;
    int mid=0,ans=-1;
    int end=list.size()-1;
    while(st<=end){
      mid=st+(end-st)/2;
      if(list.get(mid)<list.get(mid+1)){
        st=mid+1;
      }
      else{
        ans=list.get(mid);
        end=mid-1;
      }
    }
    System.out.println(ans+" ");
  }
}

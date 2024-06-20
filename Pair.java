import java.util.ArrayList;
public class Pair {
public static boolean pairSum(ArrayList<Integer> list , int target){
   int lp=0;
   int rp = list.size()-1;
   while(lp!=rp){
      if(list.get(lp)+list.get(rp)==target){
        return true;
      }
      else if((list.get(lp)+list.get(rp))<target){
          lp++;
      }
      else{
        rp--;
      }
   }
  return false;
}
  public static void main(String[] args) {
 // System.out.println("Hello World");
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(8);
    list.add(20);
    list.add(25);
    int target =28 ;
    System.out.println(pairSum(list, target));
}
}
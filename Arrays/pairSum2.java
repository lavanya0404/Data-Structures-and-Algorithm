import java.util.*;

public class pairSum2{
  public static boolean pairSum(ArrayList<Integer> a, int target){
    int lp,rp;
    int pivot=-1;
    int n=a.size();
for(int i=0; i<n; i++){
  if(a.get(i)>a.get(i+1))
  {
    pivot = i;
    break;
  }
}
lp=pivot+1;
rp=pivot;
while(lp!=rp){
  if((a.get(lp)+a.get(rp))==target){
    return true;
  }
  if((a.get(lp)+a.get(rp))<target){
    lp=(lp+1)%n;
  }
  else{
    rp=((n+rp)-1)%n;
  }
}
return false;
  }
public static void main(String[] args){
  ArrayList<Integer> list = new ArrayList<Integer>();
  list.add(20);
  list.add(25);
  list.add(30);
  list.add(4);
  list.add(5);
  list.add(6);
  list.add(8);
  list.add(10);
  list.add(15);
  int target =120 ;
  System.out.println(pairSum(list, target));
}
}
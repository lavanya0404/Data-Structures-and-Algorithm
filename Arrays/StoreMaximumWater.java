

import java.util.*;

public class StoreMaximumWater {
  public static int sotrewater(ArrayList<Integer> list) {
    int maxWater = 0;
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        {
            int height=Math.min(list.get(i),list.get(j));
            int widht = j-i;
            int currWater = height*widht;
            maxWater = Math.max(maxWater,currWater);
        } 
      }
    }
    return maxWater ;
  }
  // 2 pointer approach
  public  static int getMaxWater(ArrayList<Integer> list) {
    int lp=0; int rp=list.size()-1;
    int maxWater = 0;
    while (lp<rp) {
      int ht = Math.min(list.get(lp),list.get(rp));
      int wd= rp-lp;
      int currWater = ht*wd;
      maxWater = Math.max(maxWater,currWater);
      if(list.get(lp)<list.get(rp)){
        lp++;
      }
      else{
        rp--;
      }
    }

    return maxWater;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(6);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    System.out.println(sotrewater(list));
    System.out.println(getMaxWater(list));
    
  }
}
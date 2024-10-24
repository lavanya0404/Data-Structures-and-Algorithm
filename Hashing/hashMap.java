
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashMap{
  public static void main(String[] args) {
    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("abc", 20);
    hm.put("bac", 90);
    hm.put("cde", 80);
    hm.put("dcd", 30);
    hm.put("efd", 70);
    System.out.println(hm);
    LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
    lhm.put("abc", 20);
    lhm.put("dcd", 30);
    lhm.put("efd", 70);
    lhm.put("bac", 90);
    lhm.put("cde", 80);
    
    System.out.println(lhm);
    TreeMap<String,Integer> tm = new TreeMap<>();
    tm.put("abc", 20);
    tm.put("dcd", 30);
    tm.put("efd", 70);
    tm.put("bac", 90);
    tm.put("cde", 80);
    
    System.out.println(tm);
  }
}
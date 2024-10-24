import java.util.*;
public class hashSet {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    set.add("Bangalore");
    set.add("mysore");
    set.add("delhi");
    System.out.println(set);
    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    lhs.add("Bangalore");
    lhs.add("mysore");
    lhs.add("delhi");
    System.out.println(lhs);
    TreeSet<String> ts = new TreeSet<>();
    ts.add("Mysore");
    ts.add("Bengaluru");
    ts.add("Delhi");
    System.out.println(ts);
    Iterator it = set.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
  }
}

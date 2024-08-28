
import java.util.*;
public class duplicateElement {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(3);
        int ans = -1;
        for (int i = 0; i < list.size() ; i++) {
            int index = Math.abs(list.get(i));
            if (list.get(index) < 0) {
                ans = index;
                //   break;
            }
            list.set(index, list.get(index)* -1);
            // System.out.println(list.get(index));
        }

        System.out.println(ans + " ");
    }
}

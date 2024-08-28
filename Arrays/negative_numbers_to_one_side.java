
import java.util.*;

public class negative_numbers_to_one_side {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-5);
        list.add(2);
        list.add(0);
        list.add(-9);
        list.add(2);
        list.add(10);
        list.add(-3);
        list.add(5);
        list.add(6);
        int lp = 0;
        int rp = list.size()-1;
        while (lp < rp) {
            if (list.get(lp) < 0) {
                lp++;
            } else if (list.get(rp) > 0) {
                rp--;
            } else {
                swap(list, lp, rp);
            }
        }
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

public class missingElement {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void findMissing(int[] a, int n) {
        // Sorting method
        int i = 0;
        while (i < n) {
            int index = a[i] - 1;
            if (a[i] != a[index]) {
                swap(a, i, index);
            }
            else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
          if(i+1!=a[i])
            System.out.println(i+1+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 3, 5, 3};
        int n = a.length;
        findMissing(a, n);
    }
  } 
import java.util.Scanner;
public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Square root");
        int num = sc.nextInt();
        int ans = squareRoot(num);
        System.out.println("Enter precision");
        int prec = sc.nextInt();
        double step = 0.1;
        double finalAns = (double) ans;
        for (int i = 0; i < prec; i++) {
            for (double j = finalAns; j * j <= num; j = j + step) {
                finalAns = j;
            }
            step = step / 10;
        }
        System.out.println(finalAns);
    }

    public static int squareRoot(int num) {
        int st = 0;
        int end = num;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid * mid == num) {
                ans = mid;
            }
            if ((mid * mid) > num) {
                end = mid - 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }

}

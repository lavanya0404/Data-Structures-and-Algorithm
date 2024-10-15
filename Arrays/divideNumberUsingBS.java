
import java.util.Scanner;

public class divideNumberUsingBS {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int divisor, dividend, quotient;
            System.err.println("Enter number");
            dividend = sc.nextInt();
            divisor = sc.nextInt();
            quotient = divide(Math.abs(divisor), Math.abs(dividend));
            if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
                System.out.println(quotient);
            } else {
                System.out.println(-1 * quotient);
            }
            System.out.println("Enter precision");
            int prec = sc.nextInt();
            double finalAns = quotient;
            double step = 0.1;
            for (int i = 0; i < prec; i++) {
                for (double j = finalAns; j * divisor <= dividend; j += step) {
                    finalAns = j;
                }
                step /= 10;
            }
            if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
                System.out.println(finalAns);
            } else {
                System.out.println(-1 * finalAns);
            }
        }
    }

    public static int divide(int divisor, int dividend) {
        int st = 0;
        int mid, ans = -1;
        int end = dividend;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (mid * divisor == dividend) {
                return mid;
            }
            if (mid * divisor > dividend) {
                end = mid - 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }
        return ans;
    }
}

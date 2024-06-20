import java.util.Arrays;
import java.util.Scanner;

public class MinDifference {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int arr[]=new int[n];
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < n;i++){
      arr[i]=scanner.nextInt();
    }
    Arrays.sort(arr);
    for(int i = 0; i < n-1; i++){
      int j = i+1;
      ans = Math.min(ans,arr[j]-arr[i]);
      
    }
    System.out.println(ans);
    scanner.close();
  }
  
}

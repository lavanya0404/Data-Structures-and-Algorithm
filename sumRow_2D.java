public class sumRow_2D{
  public static void main(String[] args) {
    int arr[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };
    int row=3;
    int col=3;
    //row wise
    for(int i=0; i<row; i++) {
      int sum = 0;
      for(int j=0; j<col; j++) {
        sum+=arr[j][i];
      }
      System.out.println("sum of "+
      (i+1)+" row is "+sum+" ");
    }
//column wise 
    for(int i=0; i<row; i++) {
      int sum = 0;
      for(int j=0; j<col; j++) {
        sum+=arr[j][i];
      }
      System.out.println("sum of "+(i+1)+" column is "+sum+" ");
    }
  }
}
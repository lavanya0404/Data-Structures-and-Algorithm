
public class binarySearchFor2D_Array {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int row = 3;
        int column = 5;
        int target = 10;
        if(!(binarySearch(arr, target, row, column))){
          System.out.println("Element not found");
        }
    }

    public static boolean  binarySearch(int[][] arr, int target, int row, int column) {
        int st = 0;
        int rowIndex;
        int columnIndex;
        int end = row * column-1;
        int mid;
        while (st <= end) {
            mid = st  + (end - st) / 2;
            rowIndex = mid / column;
            columnIndex = mid % column;
            if (arr[rowIndex][columnIndex] == target) {
              System.out.println("Element found at arr["+(rowIndex+1) +"]["+ (columnIndex+1)+"]");
              return true;
            } else if (arr[rowIndex][columnIndex] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}


public class printMatrixInWaveForm {

    public static void main(String[] args) {
        int Arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int row = 4;
        int col = 3;
        for (int startCol = 0; startCol < col; startCol++) {
            if ((startCol & 1) == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.print(Arr[i][startCol] + " ");
                }
              
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(Arr[i][startCol] + " ");
                }
                
            }
            
        }
    }
}

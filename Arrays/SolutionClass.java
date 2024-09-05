import java.util.Scanner;

class SolutionClass {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Reading the input amount
        int result = MinNumOfNotes(n);
        System.out.println(result); // Outputting the result
    }

    static int MinNumOfNotes(int n) throws java.lang.Exception {
        // Array of currency denominations in descending order
        int[] denominations = {100, 50, 20, 10, 5, 2, 1};
        int count = 0; // To count the minimum number of notes

        for (int i = 0; i < denominations.length; i++) {
            // Use as many notes of this denomination as possible
            count += n / denominations[i];
            n = n % denominations[i]; // Remaining amount to be processed
        }

        return count; 
    }
}

import java.util.*;
public class potatoFarmer {  
    public static int countCombinations(List<Integer> weights, int W, int N) {
        int count = 0;
        List<List<Integer>> combinations = generateCombinations(weights, N);
        for (List<Integer> combination : combinations) {
            int sum = 0;
            for (int weight : combination) {
                sum += weight;
            }
            if (sum == W) {
                count++;
            }
        }
        return count;
    }

    public static List<List<Integer>> generateCombinations(List<Integer> weights, int N) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(weights, N, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(List<Integer> weights, int N, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == N) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < weights.size(); i++) {
            current.add(weights.get(i));
            generateCombinationsHelper(weights, N, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int W = scanner.nextInt();  // Standardized weight
        int N = scanner.nextInt();  // Number of bags a buyer can carry
        int X = scanner.nextInt();  // Number of sacks Golu has
        
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < X; i++) {
            weights.add(scanner.nextInt());
        }
        
        scanner.close();
        
        int result = countCombinations(weights, W, N);
        System.out.println(result);
    }
}
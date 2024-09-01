import java.util.*;
public class duplicateParanthesis {
    static boolean checkDuplicateParanthesis(String input) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != ')') {
                stack.push(c);
            } else {
                count = 0;
                while (stack.peek() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.err.println(str);
        System.out.println(checkDuplicateParanthesis(str));
    }
}

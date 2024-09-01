import java.util.*;

public class StackB {
  public static void pushAtBottom(Stack<Integer> stack, int item) {
    if (stack.isEmpty()) {
      stack.push(item);
      return;
    }
    int top = stack.pop();
    pushAtBottom(stack, item);
    stack.push(top);
  }
  public static void reverseStack(Stack<Integer> stack) {
    if(stack.isEmpty())
    {
      return;
    }
    int top = stack.pop();
    reverseStack(stack);
    pushAtBottom(stack, top);
  }
  public  static void printStack (Stack<Integer> stack)
  {
    while(!stack.isEmpty())
    {
      
      System.out.print(stack.pop() + " ");
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    reverseStack(s);
    System.out.println("Reversed Stack:");  // Outputs: 5 4 3 2 1  (Bottom to top)
    printStack(s);
  }
}

import java.util.*;
public class validParanthesis {
  public static boolean validParanth(String input) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < input.length(); i++)
    {
      char c = input.charAt(i);
      if(c =='{' || c=='('|| c=='[')
      {
        stack.push(c);
      }
      else
      {
        if(stack.isEmpty())
        {
          return false;
        }
        else if((c==']'&&stack.peek()=='[') ||(c=='}'&&stack.peek()=='{') ||(c==')'&&stack.peek()=='('))
        {
          stack.pop();
        }
        else
        {
          return false;
        }
      }
    }
    if(stack.isEmpty()) return true;
    else return false;
  }
  public static void main(String[] args) {
    String input = ")()";
    if(validParanth(input))
    {
      System.out.println("Valid Paranthesis");
    }
    else{
      System.out.println("Invalid Paranthesis");
    }
  }
}

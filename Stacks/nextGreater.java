import java.util.Stack;

public class nextGreater {
  public static void nextGreat(int[] arr, int[] nextGreat) {
    Stack<Integer> s = new Stack<Integer>();
    /* 
     *for nextSmaller 
      for (int i = arr.length - 1; i >= 0; i--) {
      while(!s.isEmpty() && (arr[s.peek()]>=arr[i]))
      {
        s.pop();
      }
        if(s.isEmpty())
        {
          nextGreat[i] = -1;
        }
        else{
          nextGreat[i]= arr[s.peek()];
        }
        s.push(i);
    }
    */ 
    /*
     * for previous Greater
      for (int i=0; i<arr.length; i++)
      {
      while(!s.isEmpty() && (arr[s.peek()]<=arr[i]))
      {
        s.pop();
      }
        similar 
      }
     */

      /*
     * for previous Smaller
      for (int i=0; i<arr.length; i++)
      {
      while(!s.isEmpty() && (arr[s.peek()]>=arr[i]))
      {
        s.pop();
      }
        similar 
      }
     */
    for (int i = arr.length - 1; i >= 0; i--) {
      while(!s.isEmpty() && (s.peek()<=arr[i]))
      {
        s.pop();
      }
      if(s.isEmpty())
      {
        nextGreat[i] = -1;
      }
      else{
        nextGreat[i]= arr[s.peek()];
      }
      s.push(arr[i]);
    }
  }
  public static void main(String[] args) {
      int arr[] = {3,2,12,18,66};
      int nextGreater[] = new int[arr.length];
      nextGreat(arr, nextGreater);
      System.out.println("Next Greater Element for given array is");
    for (int i : nextGreater)
      System.out.print(i+" ");
  }
}

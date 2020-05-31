package rangeExtraction_20200531;

import java.util.Stack;

public class Solution {

  public static String rangeExtraction(int[] arr) {
    Stack<Integer> consecutiveStack = new Stack<>();
    String result = "";
    consecutiveStack.push(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      if (consecutiveStack.peek() + 1 == arr[i]) {
        consecutiveStack.push(arr[i]);
      }
    }
    if (consecutiveStack.size() > 2) {
      result += consecutiveStack.firstElement() + "-" + consecutiveStack.peek();
      consecutiveStack.clear();
    }
    return result;
  }
}

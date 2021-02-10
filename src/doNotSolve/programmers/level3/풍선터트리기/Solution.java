package doNotSolve.programmers.level3.풍선터트리기;

public class Solution {

  public int solution(int[] a) {
    int count = 0;
    int leftMin = Integer.MAX_VALUE;
    int rightMin = Integer.MAX_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < leftMin) {
        count++;
        leftMin = a[i];
      }
      if (a[a.length - 1 - i] < rightMin) {
        count++;
        rightMin = a[a.length - 1 - i];
      }
    }
    return rightMin == leftMin ? count - 1 : count;
  }
}

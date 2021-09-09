package programmers.level2.최솟값만들기_20201027;

import java.util.Arrays;

public class Solution {

  public int solution(int[] A, int[] B) {
    Arrays.sort(A);
    Arrays.sort(B);
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += (A[i] * B[B.length - 1 - i]);
    }
    return sum;
  }
}

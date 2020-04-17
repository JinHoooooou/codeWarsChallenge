package squareSum_20200416;

import java.util.stream.IntStream;

public class Kata {

  public static int squareSum(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      sum += n[i] * n[i];
    }
    return sum;

    //best practice
    //return IntStream.of(n).map(x->x*x).sum();
  }
}

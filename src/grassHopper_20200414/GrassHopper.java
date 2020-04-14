package grassHopper_20200414;

import java.util.stream.IntStream;

public class GrassHopper {

  public int summation(int n) {
    int result = 0;
    for (int i = 0; i <= n; i++) {
      result += i;
    }
    return result;

    // 더 좋은답
    // return IntStream.rangeClosed(1, n).sum();
    // return n * (n + 1) / 2
  }

}

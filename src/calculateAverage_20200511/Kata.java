package calculateAverage_20200511;

import java.util.stream.IntStream;

public class Kata {

  public static double find_average(int[] array) {
    return IntStream.of(array).sum() / (double) array.length;
  }
}

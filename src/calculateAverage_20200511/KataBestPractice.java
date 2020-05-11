package calculateAverage_20200511;

import java.util.Arrays;

public class KataBestPractice {

  public static double find_average(int[] array) {
    return Arrays.stream(array).average().orElse(0);
  }
}

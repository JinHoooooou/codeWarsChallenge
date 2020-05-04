package countOfPositivesSumOfNegatives_20200504;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

  public static int[] countPositivesSumNegatives(int[] input) {
    if (input == null || input.length == 0) {
      return new int[]{};
    }
    int positiveCount = countPositive(input);
    int negativeSum = sumNegative(input);

    return new int[]{positiveCount, negativeSum};
  }

  private static int sumNegative(int[] input) {
    return IntStream.of(input).filter(x -> x < 0).sum();
  }

  private static int countPositive(int[] input) {
    return (int) IntStream.of(input).filter(x -> x > 0).count();
  }
}

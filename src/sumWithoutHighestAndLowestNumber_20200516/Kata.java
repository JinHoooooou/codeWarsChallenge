package sumWithoutHighestAndLowestNumber_20200516;

import java.util.stream.IntStream;

public class Kata {

  public static int sum(int[] numbers) {

    int max = IntStream.of(numbers).max().getAsInt();
    int min = IntStream.of(numbers).min().getAsInt();

    return IntStream.of(numbers).sum() - max - min;
  }
}

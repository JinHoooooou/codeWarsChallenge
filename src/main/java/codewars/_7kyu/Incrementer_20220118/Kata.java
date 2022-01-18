package codewars._7kyu.Incrementer_20220118;

import java.util.stream.IntStream;

public class Kata {

  public static int[] incrementer(int[] numbers) {
    return IntStream.range(0, numbers.length).map(i -> (numbers[i] + i + 1) % 10).toArray();
  }
}

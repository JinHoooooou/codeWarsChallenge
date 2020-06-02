package codeWars.sumOfTwoLowestPositiveIntegers_20200323;

import java.util.stream.IntStream;

public class Sum {

  public static int sumTwoSmallestNumbers(int[] numbers) {

    numbers = IntStream.of(numbers).sorted().toArray();

    return numbers[0] + numbers[1];
  }

}

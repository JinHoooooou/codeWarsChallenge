package codeWars.kyu7.largest5DigitNumber_20200604;

import java.util.stream.IntStream;

public class LargestFiveDigitNumberBestPractice {

  public static int solve(final String digits) {
    return IntStream.rangeClosed(0, digits.length() - 4)
        .mapToObj(i -> digits.substring(i, i + 5))
        .mapToInt(Integer::parseInt)
        .max()
        .orElse(0);
  }
}

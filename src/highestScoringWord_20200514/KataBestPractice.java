package highestScoringWord_20200514;

import java.util.Arrays;
import java.util.Comparator;

public class KataBestPractice {

  public static String high(String s) {
    return Arrays.stream(s.split(" "))
        .max(Comparator.comparingInt(
            a -> a.chars().map(i -> i - 96).sum()
        )).get();
  }
}

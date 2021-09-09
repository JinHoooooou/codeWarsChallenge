package codeWars.kyu7.numbersWithThisDigitInside_20210226;

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static long[] NumbersWithDigitInside(long x, long d) {
    long[] result = new long[3];
    List<Long> targets = new ArrayList<>();
    for (long current = 1; current <= x; current++) {
      if ((current + "").contains(d + "")) {
        targets.add(current);
      }
    }
    if (targets.isEmpty()) {
      return new long[]{0, 0, 0};
    }

    return new long[]{targets.size(),
        targets.stream().mapToLong(a -> a).sum(),
        targets.stream().reduce((a, b) -> a * b).get()};
  }

}

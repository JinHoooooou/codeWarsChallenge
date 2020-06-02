package codeWars.SumDigitPower_20200220;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

  public static List<Long> sumDigPow(long a, long b) {
    List<Long> resultContainer = new ArrayList<Long>();
    for (long target = a; target <= b; target++) {
        if (target == checkEureka(target)) {
            resultContainer.add(target);
        }
    }
    return resultContainer;
  }

  private static long checkEureka(long target) {
    String longToString = String.valueOf(target);
    long sumOfDigPower = 0;
    for (int i = 0; i < longToString.length(); i++) {
      sumOfDigPower += Math.pow(Long.parseLong(String.valueOf(longToString.charAt(i))), i + 1);
    }
    return sumOfDigPower;
  }
}

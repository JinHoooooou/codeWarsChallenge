package codeWars.isMyFriendCheating_20200420;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {

  public static List<long[]> removeNb(long n) {
    List<long[]> result = new ArrayList<>();
    int index = 0;
    long sumToN = (n * (n + 1) / 2) + 1;
    for (long first = 2; first <= n; first++) {
      long second = sumToN / first;
      if (sumToN % first == 0 && second <= n) {
        long[] pairs = new long[]{first - 1, second - 1};
        result.add(index, pairs);
        index++;
      }
    }

    return result;
  }
}

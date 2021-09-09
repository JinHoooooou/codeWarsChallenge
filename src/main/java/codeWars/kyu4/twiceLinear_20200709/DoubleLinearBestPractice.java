package codeWars.kyu4.twiceLinear_20200709;

import java.util.SortedSet;
import java.util.TreeSet;

public class DoubleLinearBestPractice {

  public static int dblLinear(int n) {
    if (n == 0) {
      return 1;
    }
    SortedSet<Integer> u = new TreeSet<>();
    u.add(1);
    for (int i = 0; i < n; i++) {
      int x = u.first();
      u.add(x * 2 + 1);
      u.add(x * 3 + 1);
      u.remove(x);
    }
    return u.first();
  }
}

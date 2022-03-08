package codewars._5kyu.Diophantine_Equation_20220308;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dioph {

  public static String solEquaStr(long n) {
    List<long[]> list = new ArrayList<>();
    int increment = n % 2 == 0 ? 1 : 2;
    for (long i = 1; i <= Math.sqrt(n); i += increment) {
      if (n % i == 0) {
        long a = i;
        long b = n / i;

        if ((b - a) % 4 == 0) {
          long y = (b - a) / 4;
          long x = a + 2 * y;
          list.add(new long[]{x, y});
        }
      }
    }
    list.sort((o1, o2) -> (int) (o2[0] - o1[0]));

    StringBuilder result = new StringBuilder("[");
    for (int i = 0; i < list.size(); i++) {
      long[] pair = list.get(i);
      result.append(String.format("[%d, %d]", pair[0], pair[1]));
      if (i != list.size() - 1) {
        result.append(", ");
      }
    }

    result.append("]");

    return result.toString();
  }
}

package youOnlyNeedOne_20200518;

import java.util.Arrays;

public class SolutionBestPractice {

  public static boolean check(Object[] a, Object x) {
    return Arrays.asList(a).contains(x);
  }
}

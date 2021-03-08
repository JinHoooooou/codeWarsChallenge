package codeWars.kyu5.findTheSmallest_20210308;

public class ToSmallest {

  public static long[] smallest(long n) {
    long[] result = new long[]{n, 0, 0};
    StringBuilder smallest = new StringBuilder("" + n);
    for (int i = 0; i < smallest.length(); i++) {
      for (int j = 0; j < smallest.length(); j++) {
        long switching = switchIndex(n, i, j);
        if (i != j && switching < result[0]) {
          result = new long[]{switching, i, j};
        }
      }
    }
    return result;
  }

  private static long switchIndex(long number, int from, int to) {
    StringBuilder num = new StringBuilder(number + "");
    char target = num.charAt(from);
    num.deleteCharAt(from);
    num.insert(to, target);

    return Long.parseLong(num.toString());
  }
}

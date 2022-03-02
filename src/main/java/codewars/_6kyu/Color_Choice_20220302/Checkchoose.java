package codewars._6kyu.Color_Choice_20220302;

public class Checkchoose {

  public static long checkchoose(long m, int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * (n - i + 1) / i;
      if (result == m) {
        return m;
      }
    }
    return -1;
  }
}

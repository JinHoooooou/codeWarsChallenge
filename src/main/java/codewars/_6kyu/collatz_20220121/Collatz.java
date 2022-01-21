package codewars._6kyu.collatz_20220121;

public class Collatz {

  public static String collatz(int n) {
    StringBuilder result = new StringBuilder();
    result.append(n);
    while (n != 1) {
      n = n % 2 == 0 ? n / 2 : n * 3 + 1;
      result.append("->").append(n);
    }
    return result.toString();
  }
}

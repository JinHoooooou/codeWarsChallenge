package codeWars.kyu5.primesInNumbers_20200627;

public class PrimeDecompBestPractice {

  public static String factors(int n) {
    String result = "";
    for (int prime = 2; prime <= n; ++prime) {
      int count;
      for (count = 0; n % prime == 0; ++count) {
        n /= prime;
      }
      if (count > 0) {
        result += "(" + prime + (count > 1 ? "**" + count : "") + ")";
      }
    }
    return result;
  }
}

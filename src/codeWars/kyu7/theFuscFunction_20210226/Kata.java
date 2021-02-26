package codeWars.kyu7.theFuscFunction_20210226;

public class Kata {

  public static int fusc(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return n % 2 == 0 ? fusc(n / 2) : fusc(n / 2) + fusc(n / 2 + 1);
  }
}

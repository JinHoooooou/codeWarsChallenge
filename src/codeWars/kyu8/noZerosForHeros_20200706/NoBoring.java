package codeWars.kyu8.noZerosForHeros_20200706;

public class NoBoring {

  public static int noBoringZeros(int n) {
    System.out.println(n);
    while (n % 10 == 0) {
      n /= 10;
    }
    return n;
  }
}

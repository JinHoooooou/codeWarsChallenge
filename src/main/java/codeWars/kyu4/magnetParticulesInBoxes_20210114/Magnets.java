package codeWars.kyu4.magnetParticulesInBoxes_20210114;

public class Magnets {

  public static double doubles(int maxk, int maxn) {

    double result = 0;

    for (int k = 1; k <= maxk; k++) {
      for (int n = 1; n <= maxn; n++) {
        double temp = (1.0 / (k * Math.pow((n + 1), 2 * k)));
        result += temp;
      }
    }
    return result;
  }
}

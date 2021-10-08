package codeWars.kyu6.Bankers_Plan_20211008;

public class BankerPlan {

  public static boolean fortune(int f0, double p, int c0, int n, double i) {
    System.out.println(String.format("f0: %d, p: %f, c0: %d, n: %d, i: %f", f0, p, c0, n, i));
    while (n > 0 && f0 >= 0){
      f0 += p/100 * f0 - c0;
      c0 += i/100 * c0;
      n--;
    }
    return n == 0;
  }
}

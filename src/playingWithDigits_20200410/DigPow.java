package playingWithDigits_20200410;

public class DigPow {

  public static long digPow(int n, int p) {
    String[] digits = String.valueOf(n).split("");
    long calResult = calculate(digits, p);

    return calResult % n == 0 ? calResult / n : -1;
  }

  public static String[] split(int n) {

    return String.valueOf(n).split("");
  }

  public static long calculate(String[] digits, int pow) {
    long result = 0;
    for (String digit : digits) {
      result += Math.pow(Integer.parseInt(digit), pow);
      pow++;
    }
    return result;
  }
}

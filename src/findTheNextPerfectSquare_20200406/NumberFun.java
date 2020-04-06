package findTheNextPerfectSquare_20200406;

public class NumberFun {

  public static long findNextSquare(long sq) {
    double sqrtOfSq = Math.sqrt(sq);
    return sqrtOfSq == Math.ceil(sqrtOfSq) ? (long) Math.pow(sqrtOfSq + 1, 2) : -1;
  }
}

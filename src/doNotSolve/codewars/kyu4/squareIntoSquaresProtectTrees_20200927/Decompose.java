package doNotSolve.codewars.kyu4.squareIntoSquaresProtectTrees_20200927;

public class Decompose {

  public String decompose(long n) {

    return recursive(n, n * n);
  }

  private String recursive(long n, long current) {
    for (long i = n - 1; i > 0; i--) {
      long diff = current - (i * i);
      if (i * i <= diff) {
        return null;
      }
      if (diff == 0) {
        return "" + i;
      }
      if (diff > 0) {
        String rest = recursive(i, diff);
        if (rest != null) {
          return rest + " " + i;
        }
      }
    }
    return null;
  }
}

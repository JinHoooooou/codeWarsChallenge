package codeWars.breakingChocolateProblem_20200504;

public class Chocolate {

  public static int breakChocolate(int n, int m) {
    if (n < 1 || m < 1) {
      return 0;
    }
    return n * m - 1;
  }
}

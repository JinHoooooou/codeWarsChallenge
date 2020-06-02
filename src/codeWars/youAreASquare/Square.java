package codeWars.youAreASquare;

public class Square {

  public static boolean isSquare(int n) {
    for (int i = 0; i <= n; i++) {
      if (i * i == n) {
        return true;
      }
    }
    return false;

    /*
    * Best Practice
    * return Math.sqrt(n*n) % 1 == 0;
    * */
  }
}

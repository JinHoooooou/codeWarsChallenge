package bouncingBalls_20200505;

public class BouncingBall {

  public static int bouncingBall(double h, double bounce, double window) {
    if (isFulfilledCondition(h, bounce, window)) {
      return -1;
    }

    int bounceCount = (int) (Math.log10(window / h) / Math.log10(bounce));

    return bounceCount * 2 + 1;
  }

  private static boolean isFulfilledCondition(double h, double bounce, double window) {
    return h <= 0 || bounce <= 0 || bounce >= 1 || window >= h;
  }
}

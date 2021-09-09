package codeWars.kyu6.ballUpwards_20201120;

public class Ball {

  static final double g = 9.81;

  public static int maxBall(int v0) {
    double v = v0 * 1000.0 / 3600;
    double h = 0.0;
    double maxHeight = 0.0;
    int t = 0;
    while ((h = height(v, ++t / 10.0)) > maxHeight) {
      maxHeight = h;
    }
    return t - 1;
  }

  private static double height(double v, double t) {
    return (v * t) - (g * 0.5 * t * t);
  }
}

package codeWars.kyu7.speedControl_20200720;

public class GpsSpeed {

  public static int gps(int s, double[] x) {
    int max = 0;
    for (int i = 1; i < x.length; i++) {
      double averageHourlySpeed = (x[i] - x[i - 1]) * 3600 / s;
      max = Math.max(max, (int) averageHourlySpeed);
    }
    return max;
  }
}

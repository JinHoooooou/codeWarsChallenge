package whatPerfectPowerAnyway_20200417;

public class PerfectPower {

  public static int[] isPerfectPower(int n) {

    int maxCheckPoint = (int) Math.ceil(Math.sqrt(n));

    for (int target = 2; target <= maxCheckPoint; target++) {
      for (int pow = 2; Math.pow(target, pow) <= n; pow++) {
        if (Math.pow(target, pow) == n) {
          return new int[]{target, pow};
        }
      }
    }

    return null;
  }

}

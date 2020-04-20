package buildPileOfCubes_20200420;

public class ASum {

  public static long findNb(long m) {
    long sum = 0;
    long result = 0;
    while (sum < m) {
      result++;
      sum += (result * result * result);
    }
    return sum == m ? result : -1;
  }

}

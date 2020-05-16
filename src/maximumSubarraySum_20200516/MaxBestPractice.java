package maximumSubarraySum_20200516;

public class MaxBestPractice {

  public static int sequence(int[] arr) {
    int max = 0;
    int sumOfSoFarIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      sumOfSoFarIndex = Math.max(0, sumOfSoFarIndex + arr[i]);
      max = Math.max(sumOfSoFarIndex, max);
    }
    return max;
  }
}

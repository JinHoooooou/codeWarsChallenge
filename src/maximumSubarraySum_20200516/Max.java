package maximumSubarraySum_20200516;

public class Max {

  public static int sequence(int[] arr) {

    int max = 0;
    for (int start = 0; start < arr.length; start++) {
      for (int end = start + 1; end < arr.length; end++) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
          sum += arr[i];
        }
        max = Math.max(max, sum);
      }
    }
    return max;
  }
}

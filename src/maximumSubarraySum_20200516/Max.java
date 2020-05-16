package maximumSubarraySum_20200516;

import java.util.stream.IntStream;

public class Max {

  public static int sequence(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    return IntStream.of(arr).sum();
  }
}

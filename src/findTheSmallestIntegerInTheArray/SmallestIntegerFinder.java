package findTheSmallestIntegerInTheArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {

  public static int findSmallestInt(int[] args) {
    return Arrays.stream(args).min().getAsInt();
  }
}

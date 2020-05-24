package howGoodAreYouReally_20200524;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return yourPoints > (double) IntStream.of(classPoints).sum() / classPoints.length;
  }
}

package needleInTheHaystack_20200426;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Kata {

  public static String findNeedle(Object[] haystack) {
    return String
        .format("found the needle at position " + Arrays.asList(haystack).indexOf("needle"));
  }
}

package removeStringSpaces_20200407;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

  public static String noSpace(final String x) {
    return Arrays.stream(x.split(" ")).collect(Collectors.joining());
    //return x.replaceAll(" ", "");
  }
}

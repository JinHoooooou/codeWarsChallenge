package codeWars.countingSheep_20200412;

import java.util.Arrays;
import java.util.Objects;

public class Counter {

  public static int countSheeps(Boolean[] arrayOfSheeps) {
    return (int)Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(i -> i).count();
  }

}

package codeWars.kyu8.smallestUnusedID_20210117;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {

  public static int nextId(int[] ids) {
    System.out.println(Arrays.toString(ids));
    int max = Arrays.stream(ids).max().orElse(0);
    List<Integer> list = IntStream.of(ids).distinct().boxed().collect(Collectors.toList());

    for (int i = 0; i <= max; i++) {
      if (!list.contains(i)) {
        return i;
      }
    }
    return max + 1;
  }
}

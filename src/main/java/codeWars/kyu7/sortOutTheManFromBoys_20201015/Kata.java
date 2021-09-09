package codeWars.kyu7.sortOutTheManFromBoys_20201015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Kata {

  public static int[] menFromBoys(final int[] values) {

    List<Integer> odds = Arrays.asList(
        Arrays.stream(values)
            .filter(x -> Math.abs(x) % 2 == 1).boxed().distinct()
            .sorted(Comparator.reverseOrder())
            .toArray(Integer[]::new));
    List<Integer> evens = Arrays.asList(
        Arrays.stream(values)
            .filter(x -> Math.abs(x) % 2 == 0).boxed().distinct()
            .sorted(Comparator.naturalOrder())
            .toArray(Integer[]::new));

    List<Integer> result = new ArrayList<>(evens);
    result.addAll(odds);

    return result.stream().mapToInt(x -> x).toArray();
  }
}

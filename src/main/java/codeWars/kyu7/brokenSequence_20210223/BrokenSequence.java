package codeWars.kyu7.brokenSequence_20210223;

import java.util.Arrays;

public class BrokenSequence {

  public static int findMissingNumber(String sequence) {
    if (sequence.isEmpty()) {
      return 0;
    }
    if (!sequence.matches("[0-9 ]+")) {
      return 1;
    }
    int[] numbers = Arrays.stream(sequence.split(" "))
        .mapToInt(Integer::parseInt)
        .sorted()
        .toArray();
    int current = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (++current != numbers[i]) {
        return current;
      }
    }

    return 0;
  }
}

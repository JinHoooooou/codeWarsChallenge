package codeWars.kyu6.difference2_20201203;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

  public static int[][] twosDifference(int[] array) {
    List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());
    numbers.sort(Comparator.naturalOrder());
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      int target = numbers.get(i);
      if (numbers.contains(target + 2)) {
        List<Integer> element = new ArrayList<>();
        element.add(target);
        element.add(target + 2);
        result.add(element);
      }
    }

    int[][] answer = new int[result.size()][2];
    for (int i = 0; i < answer.length; i++) {
      answer[i][0] = result.get(i).get(0);
      answer[i][1] = result.get(i).get(1);
    }

    return answer;
  }
}

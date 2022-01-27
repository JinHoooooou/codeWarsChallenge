package codewars._6kyu.Fruit_Machine_20220127;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  static Map<String, Integer> scoreMap = new HashMap<>();

  static {
    scoreMap.put("Wild", 10);
    scoreMap.put("Star", 9);
    scoreMap.put("Bell", 8);
    scoreMap.put("Shell", 7);
    scoreMap.put("Seven", 6);
    scoreMap.put("Cherry", 5);
    scoreMap.put("Bar", 4);
    scoreMap.put("King", 3);
    scoreMap.put("Queen", 2);
    scoreMap.put("Jack", 1);
  }

  public static int fruit(final String[][] reels, final int[] spins) {
    String first = reels[0][spins[0]];
    String second = reels[1][spins[1]];
    String third = reels[2][spins[2]];

    if (first.equals(second) && first.equals(third)) {
      return scoreMap.get(first) * 10;
    }
    if (first.equals(second) || first.equals(third) || second.equals(third)) {
      String remain = first.equals(second) ? third : first.equals(third) ? second : first;
      return scoreMap.get(first.equals(second) ? first : third) * (remain.equals("Wild") ? 2 : 1);
    }
    return 0;
  }
}

package codewars._6kyu.Alphabet_war_airstrike_letters_massacre_20220126;

import java.util.HashMap;
import java.util.Map;

public class AlphabetWarAirstrike {

  private static final String RIGHT_WIN = "Right side wins!";
  private static final String LEFT_WIN = "Left side wins!";
  private static final String DRAW = "Let's fight again!";

  public static String alphabetWar(String fight) {
    Map<Character, Integer> leftScoreMap = new HashMap<>();
    leftScoreMap.put('w', 4);
    leftScoreMap.put('p', 3);
    leftScoreMap.put('b', 2);
    leftScoreMap.put('s', 1);

    Map<Character, Integer> rightScoreMap = new HashMap<>();
    rightScoreMap.put('m', 4);
    rightScoreMap.put('q', 3);
    rightScoreMap.put('d', 2);
    rightScoreMap.put('z', 1);

    int[] score = getScore(fight.replaceAll("(\\w?\\*\\w?)", ""), leftScoreMap, rightScoreMap);

    return score[0] == score[1] ? DRAW : score[0] > score[1] ? LEFT_WIN : RIGHT_WIN;
  }

  private static int[] getScore(String fight, Map<Character, Integer> leftScoreMap,
      Map<Character, Integer> rightScoreMap) {

    int leftScore = 0;
    int rightScore = 0;
    for (int i = 0; i < fight.length(); i++) {
      leftScore += leftScoreMap.getOrDefault(fight.charAt(i), 0);
      rightScore += rightScoreMap.getOrDefault(fight.charAt(i), 0);
    }
    return new int[]{leftScore, rightScore};
  }

  public static String alphabetWarBestPractice(String fight) {
    int total = 0;
    for (char c : fight.replaceAll("\\w?\\*\\w?", "").toCharArray()) {
      total += "zdqm".indexOf(c) - "sbpw".indexOf(c);
    }
    return total == 0 ? "Let's fight again!" :
        String.format("%s side wins!", total < 0 ? "Left" : "Right");
  }
}

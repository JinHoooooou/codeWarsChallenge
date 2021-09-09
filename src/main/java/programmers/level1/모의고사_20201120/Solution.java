package programmers.level1.모의고사_20201120;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  static final int[] FIRST = {1, 2, 3, 4, 5};
  static final int[] SECOND = {2, 1, 2, 3, 2, 4, 2, 5};
  static final int[] THIRD = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

  public int[] solution(int[] answers) {
    int[] scores = getScores(answers);

    return getMax(scores);
  }

  private int[] getMax(int[] scores) {
    int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      if (max == scores[i]) {
        result.add(i + 1);
      }
    }
    return result.stream().mapToInt(x -> x).toArray();
  }

  private int[] getScores(int[] answers) {
    int[] scores = new int[3];
    for (int i = 0; i < answers.length; i++) {
      if (FIRST[i % FIRST.length] == answers[i]) {
        scores[0]++;
      }
      if (SECOND[i % SECOND.length] == answers[i]) {
        scores[1]++;
      }
      if (THIRD[i % THIRD.length] == answers[i]) {
        scores[2]++;
      }
    }
    return scores;
  }
}

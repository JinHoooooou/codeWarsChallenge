package programmers.level1.다트게임_20201116;


import java.util.Arrays;

public class Solution {

  public int solution(String dartResult) {
    int[] scores = getScores(dartResult);
    String[] bonus = getBonus(dartResult);

    return getSumOfScore(scores, bonus);
  }

  private int getSumOfScore(int[] scores, String[] bonus) {
    int[] result = new int[3];

    for (int i = 0; i < bonus.length; i++) {
      int score = scores[i];
      if (bonus[i].contains("T")) {
        score = (int) Math.pow(score, 3);
      } else if (bonus[i].contains("D")) {
        score = (int) Math.pow(score, 2);
      }
      if (bonus[i].contains("*")) {
        score *= 2;
        if (i != 0) {
          result[i - 1] *= 2;
        }
      } else if (bonus[i].contains("#")) {
        score *= -1;
      }
      result[i] = score;
    }
    return Arrays.stream(result).sum();
  }

  private String[] getBonus(String dartResult) {
    String[] bonus = new String[3];
    String[] bonusSplit = dartResult.split("\\d");
    int index = 0;
    for (int i = 0; i < bonusSplit.length; i++) {
      if (!bonusSplit[i].equals("")) {
        bonus[index++] = bonusSplit[i];
      }
    }
    return bonus;
  }

  private int[] getScores(String dartResult) {
    int[] scores = new int[3];
    String[] scoresSplit = dartResult.split("[SDT*#]");
    int index = 0;
    for (String score : scoresSplit) {
      if (!score.equals("")) {
        scores[index++] = Integer.parseInt(score);
      }
    }
    return scores;
  }
}

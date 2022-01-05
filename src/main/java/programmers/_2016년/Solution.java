package programmers._2016년;

public class Solution {

  public static String solution(int a, int b) {
    int[] month = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] weekOfDay = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int day = b;

    for (int i = 0; i < a - 1; i++) {
      day += month[i];
    }

    return weekOfDay[day % 7];
  }
}

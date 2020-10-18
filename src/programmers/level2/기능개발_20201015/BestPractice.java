package programmers.level2.기능개발_20201015;

import java.util.Arrays;

public class BestPractice {

  public int[] solution(int[] progresses, int[] speeds) {
    int[] dayOfEnd = new int[100];
    int day = -1;
    for (int i = 0; i < progresses.length; i++) {
      while (progresses[i] + (day * speeds[i]) < 100) {
        day++;
      }
      dayOfEnd[day]++;
    }
    return Arrays.stream(dayOfEnd).filter(x -> x != 0).toArray();
  }
}

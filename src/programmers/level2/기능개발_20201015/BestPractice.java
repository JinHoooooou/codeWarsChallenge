package programmers.level2.기능개발_20201015;

import java.util.Arrays;

public class BestPractice {

  public int[] solution(int[] progresses, int[] speeds) {
    int[] dayOfEnd = new int[100];
    int lastDate = Integer.MIN_VALUE;
    for (int i = 0; i < progresses.length; i++) {
      int remainDate = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
      if (remainDate > lastDate) {
        lastDate = remainDate;
      }
      dayOfEnd[lastDate]++;
    }
    return Arrays.stream(dayOfEnd).filter(x -> x != 0).toArray();
  }
}

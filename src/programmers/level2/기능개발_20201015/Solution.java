package programmers.level2.기능개발_20201015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> progressList = new ArrayList<>(
        Arrays.asList(Arrays.stream(progresses).boxed().toArray(Integer[]::new)));
    List<Integer> speedList = new ArrayList<>(
        Arrays.asList(Arrays.stream(speeds).boxed().toArray(Integer[]::new)));
    List<Integer> result = new ArrayList<>();
    while (!progressList.isEmpty()) {
      int days = (int) Math.ceil((100.0 - progressList.get(0)) / speedList.get(0));
      for (int i = 0; i < progressList.size(); i++) {
        int progress = progressList.remove(i);
        progressList.add(i, progress + (speedList.get(i) * days));
      }
      int removeCount = 0;
      while (!progressList.isEmpty() && progressList.get(0) >= 100) {
        progressList.remove(0);
        speedList.remove(0);
        removeCount++;
      }
      result.add(removeCount);
    }
    return result.stream().mapToInt(x -> x).toArray();
  }
}

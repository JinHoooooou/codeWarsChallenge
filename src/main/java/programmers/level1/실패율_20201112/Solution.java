package programmers.level1.실패율_20201112;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public int[] solution(int N, int[] stages) {
    Map<Integer, Double> stageFailRateMap = getStageFailRateMap(N, stages);
    return getResult(N, new LinkedList<>(stageFailRateMap.entrySet()));
  }

  private int[] getResult(int N, List<Entry<Integer, Double>> entries) {
    entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
    int[] result = new int[N];
    int index = 0;
    for (Entry<Integer, Double> entry : entries) {
      result[index++] = entry.getKey();
    }

    return result;
  }

  private Map<Integer, Double> getStageFailRateMap(int N, int[] stages) {
    Map<Integer, Double> map = new LinkedHashMap<>();
    for (int i = 1; i <= N; i++) {
      double failRate = reachedCount(stages, i) == 0 ? 0
          : (double) targetStageCount(stages, i) / reachedCount(stages, i);
      map.put(i, failRate);
    }
    return map;
  }

  private long reachedCount(int[] stages, int targetStage) {
    return Arrays.stream(stages).filter(x -> x >= targetStage).count();
  }

  private long targetStageCount(int[] stages, int targetStage) {
    return Arrays.stream(stages).filter(x -> x == targetStage).count();
  }
}

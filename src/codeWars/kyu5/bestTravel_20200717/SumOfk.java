package codeWars.kyu5.bestTravel_20200717;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfk {

  static Set<Integer> sumSet;

  public static Integer chooseBestSum(int limit, int townsCount, List<Integer> ls) {
    sumSet = new HashSet<>();
    dfs(ls, 0, limit, 0, townsCount);
    return sumSet.size() == 0 ? null : sumSet.stream().mapToInt(x -> x).max().getAsInt();
  }

  private static void dfs(List<Integer> ls, int sum, int limit, int currentIndex, int townsCount) {

    if (sum > limit) {
      return;
    }

    if (townsCount == 0) {
      sumSet.add(sum);
      return;
    }

    for (int i = currentIndex; i < ls.size(); i++) {
      dfs(ls, sum + ls.get(i), limit, i + 1, townsCount - 1);
    }
  }
}

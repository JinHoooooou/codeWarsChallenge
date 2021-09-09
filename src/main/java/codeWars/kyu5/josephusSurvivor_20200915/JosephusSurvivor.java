package codeWars.kyu5.josephusSurvivor_20200915;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

  public static int josephusSurvivor(final int n, final int k) {
    List<Integer> list = buildList(n);
    int index = 0;

    while (list.size() > 1) {
      index = (index + k - 1) % list.size();
      list.remove(index);
    }

    return list.get(0);
  }

  private static List<Integer> buildList(int n) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(i + 1);
    }
    return list;
  }
}

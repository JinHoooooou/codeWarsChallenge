package codeWars.kyu4.twiceLinear_20200709;

import java.util.ArrayList;
import java.util.List;

public class DoubleLinear {

  public static int dblLinear(int n) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    for (int i = 0; list.size() < Math.ceil(n * 1.25); i++) {
      int target = list.get(i);
      int x = target * 2 + 1;
      int z = target * 3 + 1;
      if (x > list.get(list.size() - 1)) {
        list.add(x);
        list.add(z);
      } else {
        List<Integer> largerThanX = new ArrayList<>();
        while (list.get(list.size() - 1) >= x) {
          int larger = list.remove(list.size() - 1);
          if (larger != x) {
            largerThanX.add(0, larger);
          }
        }
        list.add(x);
        list.addAll(largerThanX);
        list.add(z);
      }
    }
    return list.get(n);
  }
}
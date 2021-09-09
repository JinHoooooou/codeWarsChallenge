package codeWars.kyu6.ArrayDiff_20210504;

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    for (int value : a) {
      list.add(value);
    }
    for (int value : b) {
      while (list.contains(value)) {
        list.remove((Object) value);
      }
    }

    return list.stream().mapToInt(x -> x).toArray();
  }
}

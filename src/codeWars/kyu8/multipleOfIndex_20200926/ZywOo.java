package codeWars.kyu8.multipleOfIndex_20200926;

import java.util.ArrayList;
import java.util.List;

public class ZywOo {

  public static int[] multipleOfIndex(int[] array) {
    List<Integer> list = new ArrayList<>();
    if (array[0] == 0) {
      list.add(0);
    }
    for (int i = 1; i < array.length; i++) {
      if (array[i] % i == 0) {
        list.add(array[i]);
      }
    }
    return list.stream().mapToInt(x -> x).toArray();
  }
}

package codeWars.kyu6.makeTheDeadfishSwim_20200714;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {

  public static int[] parse(String data) {
    List<Integer> result = new ArrayList<>();
    int value = 0;
    for (char command : data.toCharArray()) {
      switch (command) {
        case 'i':
          value++;
          break;
        case 'd':
          value--;
          break;
        case 's':
          value *= value;
          break;
        case 'o':
          result.add(value);
          break;
        default:
          break;
      }
    }
    return result.stream().mapToInt(x -> x).toArray();
  }
}

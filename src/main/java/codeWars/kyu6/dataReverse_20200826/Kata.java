package codeWars.kyu6.dataReverse_20200826;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

  public final static int DATA_LENGTH = 8;

  public static int[] dataReverse(int[] data) {
    List<Integer> result = new ArrayList<>();
    for (int i = data.length - DATA_LENGTH; i >= 0; i -= DATA_LENGTH) {
      int[] bytes = Arrays.copyOfRange(data, i, i + DATA_LENGTH);
      for (int j = 0; j < bytes.length; j++) {
        result.add(bytes[j]);
      }
    }
    return result.stream().mapToInt(x -> x).toArray();
  }
}

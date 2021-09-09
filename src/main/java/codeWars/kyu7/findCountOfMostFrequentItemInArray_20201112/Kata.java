package codeWars.kyu7.findCountOfMostFrequentItemInArray_20201112;

import java.util.Arrays;

public class Kata {

  public static int mostFrequentItemCount(int[] collection) {
    int[] distinct = Arrays.stream(collection).distinct().toArray();
    int max = 0;
    for (int i = 0; i < distinct.length; i++) {
      int index = i;
      max = Math
          .max(max, (int) Arrays.stream(collection).filter(x -> x == distinct[index]).count());
    }
    return max;
  }
}

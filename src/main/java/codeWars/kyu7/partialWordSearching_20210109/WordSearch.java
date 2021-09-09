package codeWars.kyu7.partialWordSearching_20210109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch {

  public static String[] findWord(String x, String[] y) {
    System.out.println(x);
    System.out.println(Arrays.toString(y));
    System.out.println();
    List<String> result = new ArrayList<>();
    for (String word : y) {
      if (word.toLowerCase().contains(x.toLowerCase())) {
        result.add(word);
      }
    }
    return result.size() == 0 ? new String[]{"Empty"} : result.toArray(new String[0]);
  }
}

package codeWars.kyu7.testing1_2_3_20200710;

import java.util.Arrays;
import java.util.List;

public class LineNumbering {

  public static List<String> number(List<String> lines) {
    String[] result = new String[lines.size()];
    for (int i = 0; i < lines.size(); i++) {
      String s = lines.get(i);
      s = (i + 1) + ": " + s;
      result[i] = s;
    }
    return Arrays.asList(result);
  }
}

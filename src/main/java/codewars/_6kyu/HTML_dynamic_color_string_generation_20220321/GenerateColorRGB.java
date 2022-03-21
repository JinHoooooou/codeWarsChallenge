package codewars._6kyu.HTML_dynamic_color_string_generation_20220321;

import java.util.Random;

public class GenerateColorRGB {

  public static String generateColor(Random r) {
    long temp = r.longs(0, 16777215)
        .findFirst()
        .getAsLong();
    String hex = Long.toHexString(temp);
    return "#" + hex;
  }

  public static String generateColorBestPractice(Random r) {
    String result = "#";
    for (int i = 0; i < 6; i++) {
      result += Integer.toHexString(r.nextInt(16));
    }
    return result;
  }
}

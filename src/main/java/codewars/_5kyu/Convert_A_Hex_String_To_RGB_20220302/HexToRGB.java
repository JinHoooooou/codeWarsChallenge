package codewars._5kyu.Convert_A_Hex_String_To_RGB_20220302;

import java.util.ArrayList;
import java.util.List;

public class HexToRGB {

  public static int[] hexStringToRGB(String hex) {
    List<Integer> result = new ArrayList<>();
    String token = hex.substring(1);
    while (!token.isEmpty()) {
      String color = token.substring(0, 2);
      int rgb = Integer.parseInt(color, 16);
      result.add(rgb);
      token = token.substring(2);
    }
    return result.stream().mapToInt(x -> x).toArray();
  }

  public static int[] hexStringToRGBBestPractice(String hex) {
    return new int[]{
        Integer.parseInt(hex.substring(1, 3), 16),
        Integer.parseInt(hex.substring(3, 5), 16),
        Integer.parseInt(hex.substring(5, 7), 16)
    };
  }
}

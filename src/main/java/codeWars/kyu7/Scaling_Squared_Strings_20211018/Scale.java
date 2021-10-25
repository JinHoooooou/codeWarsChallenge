package codeWars.kyu7.Scaling_Squared_Strings_20211018;


public class Scale {

  public static String scale(String string, int k, int v) {
    StringBuilder result = new StringBuilder();
    String[] lines = string.split("\n");

    for (String line : lines) {
      String[] chars = line.split("");
      StringBuilder row = new StringBuilder();

      for (String character : chars) {
        for (int l = 0; l < k; l++) {
          row.append(character);
        }
      }

      for (int l = 0; l < v; l++) {
        result.append(row.toString() + "\n");
      }
    }
    return result.toString().trim();
  }
}

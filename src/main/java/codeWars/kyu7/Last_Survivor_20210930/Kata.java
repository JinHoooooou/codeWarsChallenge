package codeWars.kyu7.Last_Survivor_20210930;

public class Kata {

  public static String lastSurvivor(String letters, int[] coords) {
    StringBuilder result = new StringBuilder(letters);

    for (int index : coords) {
      result.deleteCharAt(index);
    }

    return result.toString();
  }
}

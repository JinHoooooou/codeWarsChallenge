package codeWars.kyu6.calculateStringRotation_20210120;

public class CalculateRotation {

  public static int shiftedDiff(String first, String second) {
    StringBuilder current = new StringBuilder(first);
    int shiftCount = 0;
    while (!current.toString().equals(second)) {
      current.insert(0, current.charAt(current.length() - 1));
      current.deleteCharAt(current.length() - 1);
      shiftCount++;
      if (shiftCount > first.length()) {
        return -1;
      }
    }
    return shiftCount;
  }
}

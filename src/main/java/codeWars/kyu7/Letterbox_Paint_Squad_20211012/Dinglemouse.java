package codeWars.kyu7.Letterbox_Paint_Squad_20211012;

public class Dinglemouse {


  public static int[] paintLetterboxes(final int start, final int end) {
    int[] result = new int[10];
    for (int i = start; i <= end; i++) {
      int temp = i;
      while (temp > 0) {
        result[temp % 10]++;
        temp /= 10;
      }
    }
    return result;
  }
}

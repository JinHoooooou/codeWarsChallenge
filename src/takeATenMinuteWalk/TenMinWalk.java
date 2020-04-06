package takeATenMinuteWalk;

import java.util.Arrays;

public class TenMinWalk {

  public static boolean isValid(char[] walk) {
    if (walk.length != 10) {
      return false;
    }

    long nCount = String.valueOf(walk).chars().filter(character -> character == 'n').count();
    long sCount = String.valueOf(walk).chars().filter(character -> character == 's').count();
    long wCount = String.valueOf(walk).chars().filter(character -> character == 'w').count();
    long eCount = String.valueOf(walk).chars().filter(character -> character == 'e').count();

    return wCount == eCount && nCount == sCount;
    /*
    int wCount = 0;
    int nCount = 0;
    int sCount = 0;
    int eCount = 0;
    int invalidCount = 0;
    for (int i = 0; i < walk.length; i++) {
      switch (walk[i]) {
        case 'w':
          wCount++;
          break;
        case 'n':
          nCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 's':
          sCount++;
          break;
        default:
          invalidCount++;
          break;
      }
    }
    if (wCount == eCount && nCount == sCount) {
      return true;
    }
    return false;
     */
  }
}

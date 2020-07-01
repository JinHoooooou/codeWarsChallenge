package codeWars.kyu5.doubleCola_20200701;

public class Line {

  public static String WhoIsNext(String[] names, int n) {
    int boundStart = 0;
    int pow = 0;
    int boundEnd = names.length * (int) Math.pow(2, pow);
    while (boundEnd < n) {
      pow++;
      boundStart = boundEnd;
      boundEnd += (names.length * (int) Math.pow(2, pow));
    }

    String result = "";
    int target = boundStart + 1;
    for (int i = 0; target <= n; i++) {
      result = names[i];
      target += (int) Math.pow(2, pow);
    }
    return result;
  }
}

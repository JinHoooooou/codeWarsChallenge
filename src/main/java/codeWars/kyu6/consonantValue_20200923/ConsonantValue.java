package codeWars.kyu6.consonantValue_20200923;

public class ConsonantValue {

  public static int solve(final String s) {
    int max = 0;
    String[] split = s.split("[aeiou]");
    for (int i = 0; i < split.length; i++) {
      int sum = 0;
      for (int j = 0; j < split[i].length(); j++) {
        sum += (split[i].charAt(j) - 'a') + 1;
      }
      max = Math.max(sum, max);
    }
    return max;
  }
}

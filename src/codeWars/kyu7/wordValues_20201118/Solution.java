package codeWars.kyu7.wordValues_20201118;

public class Solution {

  public static int[] nameValue(String[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i].chars().filter(x -> x != ' ').map(x -> x - 'a' + 1).sum() * (i + 1);
    }
    return result;
  }
}

package codeWars.kyu7.alphabetSymmetry_20201204;

public class Solution {

  public static int[] solve(String[] arr) {

    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      char alphabet = 'a';
      int count = 0;
      arr[i] = arr[i].toLowerCase();
      for (int j = 0; j < arr[i].length(); j++, alphabet++) {
        if (arr[i].charAt(j) == alphabet) {
          count++;
        }
      }
      result[i] = count;
    }
    return result;
  }
}

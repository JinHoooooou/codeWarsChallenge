package programmers.level1.비밀지도_20201111;

public class Solution {

  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] result = new String[n];
    for (int i = 0; i < result.length; i++) {
      result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
    }
    for (int i = 0; i < result.length; i++) {
      result[i] = String.format("%" + n + "s", result[i]);
      result[i] = result[i].replaceAll("1", "#").replaceAll("0", " ");
    }
    return result;
  }

  private String getBinaryString(int length, int number) {
    StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
    while (binary.length() < length) {
      binary.insert(0, "0");
    }
    return binary.toString();
  }

}

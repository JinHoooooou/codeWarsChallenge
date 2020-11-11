package programmers.level2.jadenCase문자열만들기_20201111;

public class Solution {

  public String solution(String s) {
    char[] array = s.toCharArray();
    boolean capital = true;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == ' ') {
        capital = true;
        continue;
      }
      array[i] = capital ? Character.toUpperCase(array[i]) : Character.toLowerCase(array[i]);
      capital = false;
    }
    return String.valueOf(array);
  }
}

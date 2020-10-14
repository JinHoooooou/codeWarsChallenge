package doNotSolve.programmers.level2.가장큰수;

import java.util.Arrays;

public class Solution {

  public String solution(int[] numbers) {
    String[] toStrings = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
    Arrays.sort(toStrings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
    return toStrings[0].equals("0") ? "0" : String.join("", toStrings);
  }
}

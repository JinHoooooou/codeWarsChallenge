package programmers.level2.n진수게임_20210119;

public class Solution {

  public String solution(int n, int t, int m, int p) {
    int radix = n;
    int resultLength = t;
    int people = m;
    int myTurn = p;

    String numbers = getRadixString(radix, resultLength, people);
    return getResult(numbers, myTurn, people, resultLength);
  }

  private String getResult(String numbers, int myTurn, int people, int resultLength) {
    String result = "";
    for (int i = myTurn - 1; i < numbers.length(); i += people) {
      result += numbers.charAt(i);
      if (result.length() == resultLength) {
        break;
      }
    }
    return result.toUpperCase();
  }

  private String getRadixString(int radix, int resultLength, int people) {
    StringBuilder numbers = new StringBuilder();
    int num = 0;

    while (numbers.length() <= resultLength * people) {
      numbers.append(Integer.toString(num++, radix));
    }
    return numbers.toString();
  }
}

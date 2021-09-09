package programmers.exchangeBracket;

public class Solution {

  public String solution(String p) {
    if (p.equals("")) {
      return "";
    }
    //쪼개는 index를 찾는다
    int divisionIndex = findDivisionIndex(p);
    //u는 균형잡힌 괄호인데 더 쪼갤수 없다
    String u = p.substring(0, divisionIndex);
    //v는 u 이후의 문자열인데, ""일 수도 있다.
    String v = p.substring(divisionIndex);

    if (isCorrectBracket(u)) {
      return u + solution(v);
    }
    return makeCorrectBracket(u, v);
  }

  private String makeCorrectBracket(String u, String v) {
    String result = "(" + solution(v) + ")";
    u = u.substring(1, u.length() - 1);
    for (int i = 0; i < u.length(); i++) {
      if (u.charAt(i) == '(') {
        result += ")";
      } else {
        result += "(";
      }
    }
    return result;
  }

  private boolean isCorrectBracket(String u) {
    String check = u;
    for (int i = 0; i < u.length() / 2; i++) {
      check = check.replace("()", "");
    }
    return check.length() == 0;
  }

  private int findDivisionIndex(String p) {
    int openBracketCount = 0;
    int closeBracketCount = 0;
    int divisionIndex;
    for (divisionIndex = 0; divisionIndex < p.length(); divisionIndex++) {
      if (p.charAt(divisionIndex) == '(') {
        openBracketCount++;
      } else {
        closeBracketCount++;
      }
      if (openBracketCount == closeBracketCount) {
        break;
      }
    }
    return divisionIndex + 1;
  }
}

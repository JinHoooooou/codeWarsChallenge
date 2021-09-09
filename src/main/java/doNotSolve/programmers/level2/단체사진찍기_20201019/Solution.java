package doNotSolve.programmers.level2.단체사진찍기_20201019;

public class Solution {

  int count;
  boolean[] visit;
  String[] names;

  public Solution() {
    count = 0;
    visit = new boolean[8];
    names = new String[]{"A", "C", "F", "J", "M", "N", "R", "T"};
  }

  public int solution(int n, String[] data) {
    process("", 0, data);
    return count;
  }

  private void process(String current, int index, String[] data) {
    if (current.length() == 8 && isMetCondition(current, data)) {
      count++;
      return;
    }

    for (int i = 0; i < names.length; i++) {
      if (!visit[i]) {
        visit[i] = true;
        process(current + names[i], index + 1, data);
        visit[i] = false;
      }
    }
  }

  private boolean isMetCondition(String current, String[] data) {
    for (String datum : data) {
      String expression = datum.charAt(3) + "";
      int name1Index = current.indexOf(datum.charAt(0));
      int name2Index = current.indexOf(datum.charAt(2));
      int length = Character.getNumericValue(datum.charAt(4));
      if (expression.equals(">") && Math.abs(name1Index - name2Index) <= length + 1) {
        return false;
      } else if (expression.equals("<") && Math.abs(name1Index - name2Index) >= length + 1) {
        return false;
      } else if (expression.equals("=") && Math.abs(name1Index - name2Index) != length + 1) {
        return false;
      }
    }
    return true;
  }
}

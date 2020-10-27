package programmers.level1.키패드누르기_20201027;

public class Solution {

  static final String LEFT = "L";
  static final String RIGHT = "R";

  int[] lastLeft;
  int[] lastRight;

  public String solution(int[] numbers, String hand) {
    lastLeft = new int[]{3, 0};
    lastRight = new int[]{3, 2};
    String result = "";
    for (int i = 0; i < numbers.length; i++) {
      int number = numbers[i];
      switch (number) {
        case 1:
          result += LEFT;
          lastLeft = new int[]{0, 0};
          break;
        case 2:
          result += check(2, hand);
          break;
        case 3:
          result += RIGHT;
          lastRight = new int[]{0, 2};
          break;
        case 4:
          result += LEFT;
          lastLeft = new int[]{1, 0};
          break;
        case 5:
          result += check(5, hand);
          break;
        case 6:
          result += RIGHT;
          lastRight = new int[]{1, 2};
          break;
        case 7:
          result += LEFT;
          lastLeft = new int[]{2, 0};
          break;
        case 8:
          result += check(8, hand);
          break;
        case 9:
          result += RIGHT;
          lastRight = new int[]{2, 2};
          break;
        case 0:
          result += check(0, hand);
          break;
        default:
          break;
      }
    }
    return result;
  }

  private String check(int number, String hand) {
    int[] numberIndex = new int[]{};
    if (number == 2) {
      numberIndex = new int[]{0, 1};
    } else if (number == 5) {
      numberIndex = new int[]{1, 1};
    } else if (number == 8) {
      numberIndex = new int[]{2, 1};
    } else if (number == 0) {
      numberIndex = new int[]{3, 1};
    }
    if (isLeftCloser(numberIndex)) {
      lastLeft = new int[]{numberIndex[0], numberIndex[1]};
      return LEFT;
    } else if (isRightCloser(numberIndex)) {
      lastRight = new int[]{numberIndex[0], numberIndex[1]};
      return RIGHT;
    } else {
      if (hand.equals("right")) {
        lastRight = new int[]{numberIndex[0], numberIndex[1]};
        return RIGHT;
      } else {
        lastLeft = new int[]{numberIndex[0], numberIndex[1]};
        return LEFT;
      }
    }
  }

  private boolean isRightCloser(int[] numberIndex) {
    return Math.abs((numberIndex[0] - lastLeft[0])) + Math.abs((numberIndex[1] - lastLeft[1]))
        > Math.abs((numberIndex[0] - lastRight[0])) + Math.abs((numberIndex[1] - lastRight[1]));
  }

  private boolean isLeftCloser(int[] numberIndex) {
    return Math.abs((numberIndex[0] - lastLeft[0])) + Math.abs((numberIndex[1] - lastLeft[1]))
        < Math.abs((numberIndex[0] - lastRight[0])) + Math.abs((numberIndex[1] - lastRight[1]));
  }
}

package codeWars.kyu4.theObservedPIN_20200625;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ObservedPin {

  static class Point {

    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static String[][] pinPad = {
      {"1", "2", "3"},
      {"4", "5", "6"},
      {"7", "8", "9"},
      {"-1", "0", "-1"}};
  static boolean[][] visited;
  static List<String> result;

  public static List<String> getPINs(String observed) {
    result = new ArrayList<>();
    result.add("");
    for (int i = 0; i < observed.length(); i++) {
      Point point = getTargetPoint(observed.charAt(i));
      for (int j = 0; j < result.size(); j++) {
        if (result.get(j).length() == i) {
          initializeVisited();
          process(result.get(j), point.x, point.y, point.x, point.y);
        }
      }
    }
    result = result.stream().filter(x -> x.length() == observed.length())
        .collect(Collectors.toList());
    Collections.sort(result);
    return result;
  }

  private static void initializeVisited() {
    visited = new boolean[pinPad.length][pinPad[0].length];
    visited[3][0] = true;
    visited[3][2] = true;
  }

  private static Point getTargetPoint(char target) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < pinPad.length; i++) {
      for (int j = 0; j < pinPad[i].length; j++) {
        if (pinPad[i][j].equals(String.valueOf(target))) {
          return new Point(j, i);
        }
      }
    }
    return null;
  }

  private static void process(String str, int currentX, int currentY, int firstX, int firstY) {
    if (isOutOfBound(currentX, currentY, firstX, firstY)) {
      return;
    }
    if (visited[currentY][currentX]) {
      return;
    }
    result.add(str + pinPad[currentY][currentX]);
    visited[currentY][currentX] = true;
    process(str, currentX + 1, currentY, firstX, firstY);
    process(str, currentX - 1, currentY, firstX, firstY);
    process(str, currentX, currentY + 1, firstX, firstY);
    process(str, currentX, currentY - 1, firstX, firstY);
  }

  private static boolean isOutOfBound(int currentX, int currentY, int firstX, int firstY) {
    return (currentY < 0 || currentY >= pinPad.length)
        || (currentX < 0 || currentX >= pinPad[currentY].length)
        || (Math.abs(firstX - currentX) > 1 || Math.abs(firstY - currentY) > 1)
        || (Math.abs(firstX - currentX) == 1 && Math.abs(firstY - currentY) == 1);
  }

}

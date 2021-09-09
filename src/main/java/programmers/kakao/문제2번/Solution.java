package programmers.kakao.문제2번;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  private static final int ROOM_SIZE = 5;
  private static final int PERSON = 1;
  private static final int TABLE = 0;
  private static final int WALL = -1;
  private static final int START = 2;

  private static boolean flag;
  private static int[] yPoint = {1, -1, 0, 0};
  private static int[] xPoint = {0, 0, 1, -1};

  public int[] solution(String[][] places) {
    int[] result = new int[ROOM_SIZE];
    for (int k = 0; k < ROOM_SIZE; k++) {
      String[] room = places[k];
      int[][] map = new int[ROOM_SIZE][ROOM_SIZE];
      for (int i = 0; i < ROOM_SIZE; i++) {
        for (int j = 0; j < ROOM_SIZE; j++) {
          if (room[i].charAt(j) == 'P') {
            map[i][j] = PERSON;
          } else if (room[i].charAt(j) == 'O') {
            map[i][j] = TABLE;
          } else {
            map[i][j] = WALL;
          }
        }
      }

      flag = true;
      for (int i = 0; i < ROOM_SIZE; i++) {
        for (int j = 0; j < ROOM_SIZE; j++) {
          if (map[i][j] == PERSON) {
            bfs(map, i, j);
          }
        }
      }
      result[k] = flag ? 1 : 0;
    }
    return result;
  }

  private void bfs(int[][] map, int startY, int startX) {
    if (!flag) {
      return;
    }
    Queue<int[]> queue = new LinkedList<>();
    boolean[][] visit = new boolean[ROOM_SIZE][ROOM_SIZE];
    queue.add(new int[]{startY, startX, 0});
    map[startY][startX] = START;

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int currentY = current[0];
      int currentX = current[1];
      int weight = current[2];
      if (map[currentY][currentX] == PERSON) {
        if (weight <= 2) {
          flag = false;
          break;
        }
      }
      if (visit[currentY][currentX]) {
        continue;
      }
      visit[currentY][currentX] = true;

      for (int i = 0; i < 4; i++) {
        int nextY = currentY + yPoint[i];
        int nextX = currentX + xPoint[i];
        if (isInvalidPoint(nextY, nextX)) {
          continue;
        }
        if (map[nextY][nextX] != WALL && !visit[nextY][nextX]) {
          queue.add(new int[]{nextY, nextX, weight + 1});
        }
      }

    }
  }

  private boolean isInvalidPoint(int nextY, int nextX) {
    return (nextX < 0 || nextX >= ROOM_SIZE)
        || (nextY < 0 || nextY >= ROOM_SIZE);
  }
}

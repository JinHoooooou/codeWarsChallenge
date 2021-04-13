package baekjoon.DFS와BFS.토마토_7569_20210413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

  private static int row;
  private static int col;
  private static int height;
  private static int[][][] box;
  private static int[] xPoint = {0, 0, 0, 0, 1, -1};
  private static int[] yPoint = {0, 0, 1, -1, 0, 0};
  private static int[] hPoint = {1, -1, 0, 0, 0, 0};

  public static void main(String[] args) throws IOException {
    enterInput();

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < row; j++) {
        for (int k = 0; k < col; k++) {
          if (box[i][j][k] == 1) {
            bfs(i, j, k);
          }
        }
      }
    }
    System.out.println(getMinDay());
    READER.close();
  }

  private static void enterInput() throws IOException {
    StringTokenizer stringTokenizer = new StringTokenizer(READER.readLine());
    col = Integer.parseInt(stringTokenizer.nextToken());
    row = Integer.parseInt(stringTokenizer.nextToken());
    height = Integer.parseInt(stringTokenizer.nextToken());
    box = new int[height][row][col];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < row; j++) {
        stringTokenizer = new StringTokenizer(READER.readLine());
        for (int k = 0; k < col; k++) {
          box[i][j][k] = Integer.parseInt(stringTokenizer.nextToken());
        }
      }
    }
  }

  private static void bfs(int currentHeight, int currentRow, int currentCol) {
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{currentHeight, currentRow, currentCol});

    while (!queue.isEmpty()) {
      int[] current = queue.poll();

      for (int i = 0; i < 6; i++) {
        int h = current[0] + hPoint[i];
        int y = current[1] + yPoint[i];
        int x = current[2] + xPoint[i];

        if (h < 0 || h >= height) {
          continue;
        }
        if (y < 0 || y >= row) {
          continue;
        }
        if (x < 0 || x >= col) {
          continue;
        }

        if (box[h][y][x] == 0
            || box[h][y][x] > box[current[0]][current[1]][current[2]] + 1) {
          box[h][y][x] = box[current[0]][current[1]][current[2]] + 1;
          queue.add(new int[]{h, y, x});
        }
      }
    }
  }

  private static int getMinDay() {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < row; j++) {
        for (int k = 0; k < col; k++) {
          if (box[i][j][k] == 0) {
            return -1;
          } else {
            max = Math.max(max, box[i][j][k]);
          }
        }
      }
    }
    return max - 1;
  }
}

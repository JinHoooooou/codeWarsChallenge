package baekjoon.DFS와BFS.구슬탈출2_20210705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static final char WALL = '#';
  private static final char RED = 'R';
  private static final char BLUE = 'B';
  private static final char HOLE = 'O';
  private static int row;
  private static int col;
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    row = Integer.parseInt(tokenizer.nextToken());
    col = Integer.parseInt(tokenizer.nextToken());
    int[] red = new int[2];
    int[] blue = new int[2];

    char[][] map = new char[row][col];
    for (int i = 0; i < row; i++) {
      String line = READER.readLine();
      for (int j = 0; j < col; j++) {
        char element = line.charAt(j);
        if (element == RED) {
          red = new int[]{i, j};
        } else if (element == BLUE) {
          blue = new int[]{i, j};
        }
        map[i][j] = element;
      }
    }

    boolean[][][][] visit = new boolean[row][col][row][col];
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{red[0], red[1], blue[0], blue[1], 0});
    int[] yPoint = {1, -1, 0, 0};
    int[] xPoint = {0, 0, 1, -1};
    int result = 11;
    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int redY = current[0];
      int redX = current[1];
      int blueY = current[2];
      int blueX = current[3];
      int count = current[4];

      if (count > 10) {
        continue;
      }
      if (map[blueY][blueX] == HOLE) {
        continue;
      }
      if (map[redY][redX] == HOLE && map[blueY][blueX] != HOLE) {
        result = Math.min(result, count);
        continue;
      }

      for (int i = 0; i < 4; i++) {
        int newBlueY = blueY;
        int newBlueX = blueX;
        while (map[newBlueY + yPoint[i]][newBlueX + xPoint[i]] != WALL) {
          newBlueY += yPoint[i];
          newBlueX += xPoint[i];
          if (map[newBlueY][newBlueX] == HOLE) {
            break;
          }
        }
        int newRedY = redY;
        int newRedX = redX;
        while (map[newRedY + yPoint[i]][newRedX + xPoint[i]] != WALL) {
          newRedY += yPoint[i];
          newRedX += xPoint[i];
          if (map[newRedY][newRedX] == HOLE) {
            break;
          }
        }

        if (newRedY == newBlueY && newRedX == newBlueX && map[newRedY][newRedX] != HOLE) {
          int redDistance = Math.abs(redY - newRedY) + Math.abs(redX - newRedX);
          int blueDistance = Math.abs(blueY - newBlueY) + Math.abs(blueX - newBlueX);
          if (redDistance > blueDistance) {
            newRedY -= yPoint[i];
            newRedX -= xPoint[i];
          } else {
            newBlueY -= yPoint[i];
            newBlueX -= xPoint[i];
          }
        }

        if (!visit[newRedY][newRedX][newBlueY][newBlueX]) {
          visit[newRedY][newRedX][newBlueY][newBlueX] = true;
          queue.add(new int[]{newRedY, newRedX, newBlueY, newBlueX, count + 1});
        }
      }
    }

    WRITER.write(result > 10 ? "-1" : result + "\n");
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

}

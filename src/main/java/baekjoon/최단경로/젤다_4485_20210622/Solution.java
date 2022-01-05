package baekjoon.최단경로.젤다_4485_20210622;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;
  private static int count;
  private static int length;

  public static void main(String[] args) throws IOException {
    count = 1;
    while (true) {
      tokenizer = new StringTokenizer(READER.readLine());
      length = Integer.parseInt(tokenizer.nextToken());
      if (length == 0) {
        break;
      }
      int[][] map = buildMap(length);

      dijkstra(map);
    }
    WRITER.flush();
    WRITER.close();
    READER.close();
  }

  private static int[][] buildMap(int length) throws IOException {
    int[][] map = new int[length][length];
    for (int i = 0; i < length; i++) {
      tokenizer = new StringTokenizer(READER.readLine());
      for (int j = 0; j < length; j++) {
        int blackCoin = Integer.parseInt(tokenizer.nextToken());
        map[i][j] = blackCoin;
      }
    }
    return map;
  }

  private static void dijkstra(int[][] map) throws IOException {
    PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
    int[][] distance = new int[length][length];
    for (int i = 0; i < length; i++) {
      Arrays.fill(distance[i], Integer.MAX_VALUE);
    }
    int[] yPoint = {1, -1, 0, 0};
    int[] xPoint = {0, 0, 1, -1};
    queue.add(new int[]{0, 0, map[0][0]});
    distance[0][0] = map[0][0];

    while (!queue.isEmpty()) {
      int[] current = queue.poll();
      int y = current[0];
      int x = current[1];
      if (distance[y][x] == Integer.MAX_VALUE) {
        continue;
      }

      for (int i = 0; i < 4; i++) {
        int moveY = y + yPoint[i];
        int moveX = x + xPoint[i];

        if (isOutOfBound(moveY, moveX)) {
          continue;
        }
        if (distance[moveY][moveX] > distance[y][x] + map[moveY][moveX]) {
          distance[moveY][moveX] = distance[y][x] + map[moveY][moveX];
          queue.add(new int[]{moveY, moveX, distance[moveY][moveX]});
        }
      }
    }

    int min = distance[length - 1][length - 1];
    WRITER.write(String.format("Problem %d: %d\n", count++, min));
  }

  private static boolean isOutOfBound(int moveY, int moveX) {
    return (moveY < 0 || moveY >= length) || (moveX < 0 || moveX >= length);
  }
}

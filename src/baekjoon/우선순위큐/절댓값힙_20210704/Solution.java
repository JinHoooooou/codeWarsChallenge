package baekjoon.우선순위큐.절댓값힙_20210704;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {

  private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private static final BufferedWriter WRITER = new BufferedWriter(
      new OutputStreamWriter(System.out));
  private static StringTokenizer tokenizer;

  public static void main(String[] args) throws IOException {
    tokenizer = new StringTokenizer(READER.readLine());
    int operationCount = Integer.parseInt(tokenizer.nextToken());
    PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return Math.abs(o1) == Math.abs(o2) ? o1 - o2 : Math.abs(o1) - Math.abs(o2);
      }
    });
    WRITER.flush();
    WRITER.close();
    READER.close();
  }
}
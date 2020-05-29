package dontGiveMeFive_20200529;

import java.util.stream.IntStream;

public class Kata {

  public static int dontGiveMeFive(int start, int end) {
    System.out.println(start + " " + end);
    int fiveCount = (int) IntStream.rangeClosed(start, end)
        .filter(x -> String.valueOf(x).contains("5")).count();
    return end - start + 1 - fiveCount;
  }
}

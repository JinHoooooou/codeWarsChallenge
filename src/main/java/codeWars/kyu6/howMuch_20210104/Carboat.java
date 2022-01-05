package codeWars.kyu6.howMuch_20210104;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Carboat {

  public static String howmuch(int m, int n) {
    Map<Integer, Integer> map = new TreeMap<>();
    int start = Math.min(m, n);
    int end = Math.max(m, n);
    String elements = IntStream.rangeClosed(start, end)
        .filter(x -> x % 9 == 1 && x % 7 == 2)
        .mapToObj(x -> String.format("[M: %d B: %d C: %d]", x, x / 7, x / 9))
        .collect(Collectors.joining());
    return "[" + elements + "]";
  }
}

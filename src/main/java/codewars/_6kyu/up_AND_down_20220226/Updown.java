package codewars._6kyu.up_AND_down_20220226;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Updown {

  public static String arrange(String strng) {
    String[] tokens = strng.split(" ");
    int length = tokens.length;

    for (int i = 0; i < length - 1; i++) {
      if (isValid(i, tokens)) {
        swap(tokens, i, i + 1);
      }
    }
    return IntStream
        .range(0, length)
        .mapToObj(i -> i % 2 == 0 ? tokens[i].toLowerCase() : tokens[i].toUpperCase())
        .collect(Collectors.joining(" "));
  }

  private static boolean isValid(int index, String[] tokens) {
    return (index % 2 == 0) && (tokens[index].length() > tokens[index + 1].length()) ||
        (index % 2 == 1) && (tokens[index].length() < tokens[index + 1].length());
  }

  private static void swap(String[] tokens, int a, int b) {
    String temp = tokens[a];
    tokens[a] = tokens[b];
    tokens[b] = temp;
  }
}

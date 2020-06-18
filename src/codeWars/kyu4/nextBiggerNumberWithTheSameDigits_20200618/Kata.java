package codeWars.kyu4.nextBiggerNumberWithTheSameDigits_20200618;

import java.util.Set;
import java.util.TreeSet;

public class Kata {

  static Set<String> numberSet;

  public static long nextBiggerNumber(long n) {
    numberSet = new TreeSet<>();
    String toString = String.valueOf(n);
    int index = 2;
    while (index <= toString.length()) {
      String front = toString.substring(0, toString.length() - index);
      String end = toString.substring(toString.length() - index);
      process(end, front, toString.length());
      Object[] s = numberSet.stream().filter(x -> Long.parseLong(x) > n).toArray();
      if (s.length != 0) {
        return Long.parseLong(String.valueOf(s[0]));
      }
      index++;
    }
    return -1;
  }

  private static void process(String toString, String makingString, int wantedLength) {
    if (makingString.length() == wantedLength) {
      numberSet.add(makingString);
      return;
    }
    for (int i = 0; i < toString.length(); i++) {
      String baseString = toString.substring(0, i) + toString.substring(i + 1);
      process(baseString, makingString + toString.charAt(i), wantedLength);
    }
  }
}


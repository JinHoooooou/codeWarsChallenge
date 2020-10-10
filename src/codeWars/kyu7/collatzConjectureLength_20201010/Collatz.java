package codeWars.kyu7.collatzConjectureLength_20201010;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

  public static long conjecture(long x) {
    long count = 1;
    long current = x;
    while (current > 1) {
      current = current % 2 == 0 ? current / 2 : current * 3 + 1;
      count++;
    }
    return count;
  }
}

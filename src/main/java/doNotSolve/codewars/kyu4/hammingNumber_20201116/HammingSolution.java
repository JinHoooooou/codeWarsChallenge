package doNotSolve.codewars.kyu4.hammingNumber_20201116;

import java.util.TreeSet;

public class HammingSolution {

  public static long hamming(int n) {
    TreeSet<Long> hammings = new TreeSet<>();
    hammings.add(1L);
    long smallest = 0;
    for (int i = 0; i < n; i++) {
      smallest = hammings.pollFirst();
      hammings.add(smallest * 2);
      hammings.add(smallest * 3);
      hammings.add(smallest * 5);
    }
    return smallest;
  }
}

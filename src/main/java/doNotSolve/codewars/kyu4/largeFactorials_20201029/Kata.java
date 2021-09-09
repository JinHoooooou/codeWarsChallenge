package doNotSolve.codewars.kyu4.largeFactorials_20201029;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

  public static String factorial(int n) {
    List<Long> digits = new ArrayList<>();
    saveDigits(digits, n);
    for (long value = n - 1; value > 1; value--) {
      List<Long> temp = new ArrayList<>();
      long carry = 0;
      for (long digit : digits) {
        long result = value * digit + carry;
        temp.add(result % 10);
        carry = result / 10;
      }
      if (carry != 0) {
        saveDigits(temp, carry);
      }
      digits = temp;
    }
    return new StringBuilder(digits.stream().map(String::valueOf).collect(Collectors.joining()))
        .reverse().toString();
  }

  private static void saveDigits(List<Long> digits, long value) {
    if (value < 10) {
      digits.add(value);
      return;
    }
    while (value > 0) {
      digits.add(value % 10);
      value /= 10;
    }
  }
}

package codeWars.squareEveryDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {

  public int squareDigit(int n) {
    List<Integer> list = new ArrayList<>();
    while (n > 0) {
      int digit = n % 10;
      list.add(0, digit * digit);
      n /= 10;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      result.append(list.get(i));
    }
    return Integer.parseInt(result.toString());
  }
}

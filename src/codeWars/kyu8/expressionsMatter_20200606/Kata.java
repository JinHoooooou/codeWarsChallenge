package codeWars.kyu8.expressionsMatter_20200606;

import java.util.ArrayList;
import java.util.List;

public class Kata {

  public static int expressionsMatter(int a, int b, int c) {

    int result = a * b * c;
    if (result < a + b + c) {
      result = a + b + c;
    }
    if (result < (a + b) * c) {
      result = (a + b) * c;
    }
    if (result < a * (b + c)) {
      result = a * (b + c);
    }
    return result;
  }
}

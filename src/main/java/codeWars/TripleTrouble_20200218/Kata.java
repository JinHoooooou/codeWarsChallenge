package codeWars.TripleTrouble_20200218;

public class Kata {

  public static int TripleDouble(long num1, long num2) {

    String num1ToString = String.valueOf(num1);
    String num2ToString = String.valueOf(num2);
    for (int i = 0; i < 10; i++) {
      String number = String.valueOf(i);
        if (num1ToString.contains(number + number + number) && num2ToString
            .contains(number + number)) {
            return 1;
        }
    }
    return 0;
  }
}

package codeWars.kyu7.roundUpToTheNextMultipleOf5_20200619;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    int num = number;
    int reminder = num % 10;
    num /= 10;
    if (reminder >= -9 && reminder <= -5) {
      num = num * 10 - 5;
    } else if (reminder >= -4 && reminder <= 0) {
      num = num * 10;
    } else if (reminder >= 1 && reminder <= 5) {
      num = num * 10 + 5;
    } else {
      num = num * 10 + 10;
    }

    return num;
  }
}

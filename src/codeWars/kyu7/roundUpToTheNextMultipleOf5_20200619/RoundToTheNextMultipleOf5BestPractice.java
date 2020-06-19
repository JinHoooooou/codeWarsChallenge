package codeWars.kyu7.roundUpToTheNextMultipleOf5_20200619;

public class RoundToTheNextMultipleOf5BestPractice {

  public static int roundToNext5(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}

package codeWars.kyu7.roundUpToTheNextMultipleOf5_20200619;

public class RoundToTheNextMultipleOf5AnotherSolution {

  public static int roundToNext5(int number) {
    return (int) Math.ceil((double) number / 5) * 5;
  }
}

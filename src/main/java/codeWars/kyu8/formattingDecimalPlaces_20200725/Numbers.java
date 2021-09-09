package codeWars.kyu8.formattingDecimalPlaces_20200725;

public class Numbers {

  public static double twoDecimalPlaces(double number) {
    return Double.parseDouble(String.format("%.2f", number));
  }
}

package codeWars.kyu8.tipCalculator_20200816;

public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {
    rating = rating.toLowerCase();
    switch (rating) {
      case "terrible":
        return 0;
      case "poor":
        return (int) Math.ceil(amount * 0.05);
      case "good":
        return (int) Math.ceil(amount * 0.10);
      case "great":
        return (int) Math.ceil(amount * 0.15);
      case "excellent":
        return (int) Math.ceil(amount * 0.20);
      default:
        return null;
    }
  }
}

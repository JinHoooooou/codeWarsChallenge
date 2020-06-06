package codeWars.kyu8.calculateBMI_20200606;

public class Calculate {

  public static String bmi(double weight, double height) {
    double bmi = weight / (height * height);
    if (bmi <= 18.5) {
      return "UnderWeight";
    } else if (bmi <= 25.0) {
      return "Normal";
    } else if (bmi <= 30.0) {
      return "OverWeight";
    }
    return "Obese";
  }
}

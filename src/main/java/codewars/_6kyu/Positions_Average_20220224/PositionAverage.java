package codewars._6kyu.Positions_Average_20220224;

public class PositionAverage {

  public static double posAverage(String s) {
    String[] tokens = s.split(", ");
    int denominator = (tokens.length * (tokens.length - 1)) * tokens[0].length() / 2;
    int count = 0;
    for (int i = 0; i < tokens.length; i++) {
      String target = tokens[i];
      for (int j = i + 1; j < tokens.length; j++) {
        String compare = tokens[j];
        for (int k = 0; k < target.length(); k++) {
          if (target.charAt(k) == compare.charAt(k)) {
            count++;
          }
        }
      }
    }
    double result = count * 100.0 / denominator;

    return result;
  }
}

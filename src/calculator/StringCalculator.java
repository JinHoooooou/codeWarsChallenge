package calculator;

public class StringCalculator {

  public static int add(String text) {
    if (text == null || text.isEmpty()) {
      return 0;
    }
    String[] split = text.split(",");
    int sum = 0;
    if (split.length == 1) {
      return Integer.parseInt(text);
    }
    for (String s : split) {
      sum += Integer.parseInt(s);
    }


    return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
  }
}

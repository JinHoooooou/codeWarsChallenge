package writeNumberInExpandedForm_20200513;

public class Kata {

  public static String expandedForm(int num) {
    String result = "";
    int mulTimes = (int) Math.log10(num);
    for (int i = mulTimes; i >= 0; i--) {
      int pow = (int) Math.pow(10, i);
      int number = (num / pow) * pow;
      if (number != 0) {
        result += "" + number + " + ";
      }
      num = num % pow;
    }
    return result.substring(0, result.length() - 3);
  }
}

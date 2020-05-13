package writeNumberInExpandedForm_20200513;

public class Kata {

  public static String expandedForm(int num) {
    int[] numbers = new int[(int) Math.log10(num) + 1];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = num % 10;
      num /= 10;
    }
    String result = "";
    for (int i = numbers.length - 1; i >= 0; i--) {
      result += "" + (numbers[i] * (int) Math.pow(10, i));
      if (i != 0) {
        result += " + ";
      }
    }
    return result;
  }
}

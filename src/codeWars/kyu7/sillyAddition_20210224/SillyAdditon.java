package codeWars.kyu7.sillyAddition_20210224;

public class SillyAdditon {

  public static int add(int num1, int num2) {
    String result = "";
    for (; 0 < num1 + num2; num1 /= 10, num2 /= 10) {
      result = (num1 % 10 + num2 % 10) + result;
    }

    return result.length() < 1 ? 0 : Integer.parseInt(result);
  }
}

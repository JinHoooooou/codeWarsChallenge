package codewars._5kyu.Decimal_to_Factorial_and_Back_20220321;

public class Dec2Fact {

  public static String dec2FactString(long nb) {
    StringBuilder result = new StringBuilder();
    long balance = nb;
    for (int i = 36; i >= 0; i--) {
      long factorial = getFactorial(balance, i);
      if (factorial > 0) {
        result.append(encode(balance / factorial));
        balance -= factorial * (balance / factorial);
      } else {
        result.append("0");
      }
    }
    return result.toString().replaceAll("^0+", "");
  }

  private static long getFactorial(long balance, int value) {
    long factorial = 1;
    for (int i = value; i > 0; i--) {
      factorial *= i;
      if (factorial > balance) {
        return 0;
      }
    }
    return factorial;
  }

  private static String encode(long value) {
    return value >= 10 ? (char) ('A' + (value - 10)) + "" : value + "";
  }

  public static long factString2Dec(String str) {
    long result = 0;
    int index = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      int multiplyValue = decode(str.charAt(i));
      result += getFactorial(multiplyValue, index++);
    }
    return result;
  }

  private static long getFactorial(int multiplyValue, int digit) {
    long result = 1;
    for (int i = digit; i > 0; i--) {
      result *= i;
    }
    return result * multiplyValue;
  }

  private static int decode(char character) {
    return character >= 'A' ? (character - 'A' + 10) : Integer.parseInt(character + "");
  }
}

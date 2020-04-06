package sumOfDigits;

public class DRoot {

  public static int digital_root(int n) {

    int result = n;
    while (result > 9) {
      result = splitDigitAndAddEachDigit(result);
    }
    return result;
  }

  private static int splitDigitAndAddEachDigit(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}

  /*public static int digital_root(int n) {
    return (n != 0 && n % 9 == 0) ? 9 : n % 9;
  }
  */
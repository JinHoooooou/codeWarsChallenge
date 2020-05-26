package romanNumeralsEncoder;

public class Conversion {

  public String solution(int n) {
    String result = "";
    while (n != 0) {
      if (n >= 5) {
        result += "V";
        n -= 5;
      } else if (n >= 4) {
        result += "IV";
        n -= 4;
      } else {
        result += "I";
        n -= 1;
      }
    }
    return result;
  }
}

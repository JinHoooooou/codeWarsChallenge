package romanNumeralsEncoder;

public class Conversion {

  public String solution(int n) {
    String result = "";
    while (n != 0) {
      result += "I";
      n -= 1;
    }
    return result;
  }
}

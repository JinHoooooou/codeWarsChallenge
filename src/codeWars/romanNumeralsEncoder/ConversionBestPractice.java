package codeWars.romanNumeralsEncoder;

public class ConversionBestPractice {

  public String solution(int number) {
    String romanNumbers[] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX",
        "V", "IV", "I"};
    int arab[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (number > 0 || arab.length == (i - 1)) {
      while ((number - arab[i]) >= 0) {
        number -= arab[i];
        result.append(romanNumbers[i]);
      }
      i++;
    }
    return result.toString();
  }
}

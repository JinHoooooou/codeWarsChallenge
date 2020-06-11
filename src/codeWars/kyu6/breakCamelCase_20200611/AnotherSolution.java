package codeWars.kyu6.breakCamelCase_20200611;

public class AnotherSolution {

  public static String camelCase(String input) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        result.append(" ").append(input.charAt(i));
      } else {
        result.append(input.charAt(i));
      }
    }
    return result.toString().trim();
  }
}

package camelCaseMethod_20200527;

public class SolutionBestPractice {

  public static String camelCase(String str) {
    String[] strings = str.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for (String string : strings) {
      if (string.length() > 0) {
        stringBuilder.append(
            string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
      }
    }
    return new String(stringBuilder);
  }

}

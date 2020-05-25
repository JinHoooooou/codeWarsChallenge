package scramblies_20200525;

public class Scramblies {

  public static boolean scramble(String str1, String str2) {
    for (int i = 0; i < str1.length(); i++) {
      String target = String.valueOf(str1.charAt(i));
      if (str2.contains(target)) {
        str2 = str2.replaceFirst(target, "");
      }
    }
    return str2.length() == 0;
  }
}

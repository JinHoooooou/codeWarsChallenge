package scramblies_20200525;

public class Scramblies {

  public static boolean scramble(String str1, String str2) {
    char[] toArray = str2.toCharArray();
    for (int i = 0; i < str1.length(); i++) {
      char target = str1.charAt(i);
      if (str2.contains(String.valueOf(target))) {
        str2 = str2.replaceFirst(String.valueOf(target), "");
      }
    }
    return str2.trim().length() == 0;
  }
}

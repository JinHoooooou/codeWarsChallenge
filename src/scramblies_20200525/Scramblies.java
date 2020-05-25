package scramblies_20200525;

public class Scramblies {

  public static boolean scramble(String str1, String str2) {
    for (String target : str1.split("")) {
      if (str2.contains(target)) {
        str2 = str2.replaceFirst(target, "");
      }
    }
    return str2.length() == 0;
  }
}

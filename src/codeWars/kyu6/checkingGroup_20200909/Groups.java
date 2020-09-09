package codeWars.kyu6.checkingGroup_20200909;

public class Groups {

  public static boolean groupCheck(String s) {
    int length = s.length() / 2;
    for (int i = 0; i < length; i++) {
      s = s.replace("()", "");
      s = s.replace("{}", "");
      s = s.replace("[]", "");
    }
    return s.length() == 0;
  }
}

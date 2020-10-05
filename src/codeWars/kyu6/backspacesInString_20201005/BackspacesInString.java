package codeWars.kyu6.backspacesInString_20201005;

public class BackspacesInString {

  public String cleanString(String s) {
    int length = s.length();
    for (int i = 0; i < length; i++) {
      s = s.replaceAll("[^#]#", "");
      if (!s.contains("#")) {
        break;
      }
    }

    return s.replaceAll("#", "");
  }
}

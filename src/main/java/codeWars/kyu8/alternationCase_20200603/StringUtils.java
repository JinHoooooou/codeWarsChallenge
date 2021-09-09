package codeWars.kyu8.alternationCase_20200603;

public class StringUtils {

  public static String toAlternativeString(String string) {
    String[] characters = string.split("");
    for (int i = 0; i < characters.length; i++) {
      if (characters[i].matches("[a-z]")) {
        characters[i] = characters[i].toUpperCase();
      } else if (characters[i].matches("[A-Z]")) {
        characters[i] = characters[i].toLowerCase();
      }
    }

    return String.join("",characters);
  }
}

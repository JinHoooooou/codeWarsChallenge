package codeWars.CountingDuplicates_20200319;

public class CountingDuplicates {

  public static int duplicateCount(String text) {

    int count = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String targetCharacter = text.substring(0, 1);
      text = text.substring(1);
      if (text.contains(targetCharacter)) {
        count++;
      }
      text = text.replace(targetCharacter, "");
    }
    return count;

    /*text = text.toLowerCase();
    String[] character = text.split("");
    int count = 0;
    String target = "";
    for (int i = 0; i < character.length; i++) {
      if (character[i].equals(target)) {
        continue;
      }
      for (int j = 0; j < i; j++) {
        if (character[i].equals(character[j])) {
          target = character[i];
          count++;
          break;
        }
      }
    }
    return count;
    */
  }
}
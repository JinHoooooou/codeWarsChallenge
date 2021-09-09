package codeWars.kyu6.wordA10n_20200814;

import java.util.ArrayList;
import java.util.List;

public class Abbreviator {

  public String abbreviate(String string) {
    List<Character> specialCharacterList = buildSpecialCharacterList(string);
    String[] words = string.split("[-_;:., !?\\d']");

    return getAbbreviationString(words, specialCharacterList);
  }

  private String getAbbreviationString(String[] words, List<Character> specialCharacterList) {
    StringBuilder result = new StringBuilder();
    for (String word : words) {
      result.append(getAbbreviation(word));
      if (!specialCharacterList.isEmpty()) {
        result.append(specialCharacterList.remove(0));
      }
    }
    return result.toString();
  }

  private List<Character> buildSpecialCharacterList(String string) {
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      if (String.valueOf(string.charAt(i)).matches("[-_;:., !?\\d']")) {
        list.add(string.charAt(i));
      }
    }
    return list;
  }

  private String getAbbreviation(String word) {
    if (word.length() < 4) {
      return word;
    }
    String stringExceptFirstAndLast = word.substring(1, word.length() - 1);
    return word.charAt(0) + String.valueOf(stringExceptFirstAndLast.length()) + word
        .charAt(word.length() - 1);
  }
}

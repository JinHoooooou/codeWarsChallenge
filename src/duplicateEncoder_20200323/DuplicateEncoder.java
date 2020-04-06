package duplicateEncoder_20200323;

public class DuplicateEncoder {

  static String encode(String word) {
    word = word.toLowerCase();

    char[] encodingChar = new char[word.length()];
    char[] toArray = word.toCharArray();
    for (int i = 0; i < toArray.length; i++) {
      if (encodingChar[i] != '\0') {
        continue;
      }
      char target = toArray[i];
      for (int j = i + 1; j < toArray.length; j++) {
        if (target == toArray[j]) {
          encodingChar[j] = ')';
          encodingChar[i] = ')';
        }
      }
      if (encodingChar[i] != ')') {
        encodingChar[i] = '(';
      }
    }
    return new String(encodingChar);
  }
}


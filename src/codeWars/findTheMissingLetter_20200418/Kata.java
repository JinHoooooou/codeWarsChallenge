package codeWars.findTheMissingLetter_20200418;

public class Kata {

  public static char findMissingLetter(char[] array) {
    char result = array[0];
    for (char letter : array) {
      if (result != letter) {
        break;
      }
      result++;
    }
    return result;
  }
}

package codeWars.kyu7.alphabeticalAddition_20200917;

public class Kata {

  public static String addLetters(String... letters) {
    if (letters.length == 0) {
      return "z";
    }
    char result = letters[0].charAt(0);
    for (int i = 1; i < letters.length; i++) {
      result += (letters[i].charAt(0) - 'a' + 1);
      if (result > 'z') {
        result -= 26;
      }
    }
    return result + "";
  }
}

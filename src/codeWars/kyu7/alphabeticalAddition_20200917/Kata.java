package codeWars.kyu7.alphabeticalAddition_20200917;

public class Kata {

  public static String addLetters(String... letters) {
    if (letters[0].equals("")) {
      return "z";
    }
    char result = letters[0].charAt(0);
    for (int i = 1; i < letters.length; i++) {
      result += (letters[i].charAt(0) - 'a' + 1);
      if (result > 'z') {
        result -= 'z' + 'a';
      }
    }
    return result + "";
  }
}

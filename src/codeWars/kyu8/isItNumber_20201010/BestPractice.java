package codeWars.kyu8.isItNumber_20201010;

public class BestPractice {

  public boolean isDigit(String s) {
    try {
      Double.parseDouble(s);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}

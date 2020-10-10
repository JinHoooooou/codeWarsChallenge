package codeWars.kyu8.isItNumber_20201010;

public class MyUtilities {

  public boolean isDigit(String s) {
    if (s.trim().matches("\\-?[0-9]+")) {
      return true;
    } else if (s.trim().matches("\\-?[0-9]+\\.[0-9]+")) {
      return true;
    }
    return false;
  }
}

package printerErrors_20200409;

public class Printer {
  public static final char ERROR_CHAR_INDEX = 'm';

  public static String printerError(String s) {
    long count = s.chars().filter(c -> c > ERROR_CHAR_INDEX).count();
    return String.format("%d/%d", count, s.length());
  }
}

package codewars._7kyu.Filter_the_number;

public class Kata {

  public static long filterString(final String value) {
    return Long.parseLong(value.replaceAll("\\D", ""));
  }
}

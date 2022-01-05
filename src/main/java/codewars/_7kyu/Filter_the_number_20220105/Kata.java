package codewars._7kyu.Filter_the_number_20220105;

public class Kata {

  public static long filterString(final String value) {
    return Long.parseLong(value.replaceAll("\\D", ""));
  }
}

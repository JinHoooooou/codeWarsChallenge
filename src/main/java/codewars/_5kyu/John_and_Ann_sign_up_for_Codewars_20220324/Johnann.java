package codewars._5kyu.John_and_Ann_sign_up_for_Codewars_20220324;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Johnann {

  private enum Person {JOHN, ANN}

  private static List<Long> getListForName(Person person, long n) {
    List<Long> johnList = new ArrayList<>(Arrays.asList(0L));
    List<Long> annList = new ArrayList<>(Arrays.asList(1L));

    for (int johnDay = 1, annDay = 1; johnDay < n || annDay < n; ) {
      if (johnList.size() > annList.get(annDay - 1)) {
        annList.add(annDay - johnList.get(Math.toIntExact(annList.get(annDay - 1))));
        annDay++;
      }
      if (annList.size() > johnList.get(johnDay - 1)) {
        johnList.add(johnDay - annList.get(Math.toIntExact(johnList.get(johnDay - 1))));
        johnDay++;
      }
    }
    return (person == Person.JOHN ? johnList : annList).subList(0, Math.toIntExact(n));

  }

  public static List<Long> john(long n) {
    return getListForName(Person.JOHN, n);
  }

  public static List<Long> ann(long n) {
    return getListForName(Person.ANN, n);
  }

  public static long sumJohn(long n) {
    return john(n).stream().mapToLong(x -> x).sum();
  }

  public static long sumAnn(long n) {
    return ann(n).stream().mapToLong(x -> x).sum();
  }
}

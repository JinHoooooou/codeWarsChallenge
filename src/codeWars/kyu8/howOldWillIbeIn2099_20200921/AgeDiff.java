package codeWars.kyu8.howOldWillIbeIn2099_20200921;

public class AgeDiff {

  public static String calculateAge(int birth, int yearTo) {
    return birth < yearTo ? getAge(yearTo - birth)
        : (birth == yearTo ? born() : willBorn(birth - yearTo));
  }

  private static String willBorn(int expectedDate) {
    String message = String.format("You will be born in %d year", expectedDate);
    return expectedDate == 1 ? message + "." : message + "s.";
  }

  private static String born() {
    return "You were born this very year!";
  }

  private static String getAge(int age) {
    String message = String.format("You are %d years old.", age);
    return age == 1 ? message.replace("s", "") : message;
  }
}

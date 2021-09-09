package doNotSolve.codewars.kyu5.mergedStringChecker_20201017;

public class StringMerger {

  public static boolean isMerge(String s, String part1, String part2) {
    if (part1.concat(part2).length() != s.length()) {
      return false;
    }
    if (s.length() == 0) {
      return true;
    }
    return check(s, part1, part2) || check(s, part2, part1);
  }

  private static boolean check(String s, String targetString, String another) {
    return targetString.length() > 0
        && targetString.charAt(0) == s.charAt(0)
        && isMerge(s.substring(1), targetString.substring(1), another);
  }
}

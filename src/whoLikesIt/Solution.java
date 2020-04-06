package whoLikesIt;

public class Solution {

  public static String whoLikesIt(String... names) {
    StringBuilder result = new StringBuilder();

    switch (names.length) {
      case 0:
        result.append("no one likes this");
        break;
      case 1:
        result.append(names[0]).append(" likes this");
        break;
      case 2:
        result.append(names[0]).append(" and ").append(names[1]).append(" like this");
        break;
      case 3:
        result.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2])
            .append(" like this");
        break;
      default:
        result.append(names[0]).append(", ").append(names[1]).append(" and ")
            .append(names.length - 2).append(" others like this");
        break;
    }
    return result.toString();
  }
  /*
      public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
   */
}

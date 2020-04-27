package directionsReduction_20200427;

import java.util.Stack;

public class DirReduction {

  public static final String SOUTH_NORTH = "SOUTH NORTH";
  public static final String NORTH_SOUTH = "NORTH SOUTH";
  public static final String WEST_EAST = "WEST EAST";
  public static final String EAST_WEST = "EAST WEST";

  public static String[] dirReduc(String[] arr) {
    String beforeString = "";
    String afterString = String.join(" ", arr);
    while (beforeString.length() != afterString.length()) {
      beforeString = afterString;
      afterString = beforeString.replace("SOUTH NORTH", "")
          .replace("NORTH SOUTH", "")
          .replace("EAST WEST", "")
          .replace("WEST EAST", "")
          .replaceAll(" +", " ").trim();
    }

    if (afterString.length() == 0) {
      return new String[]{};
    }
    return afterString.split(" ");
  }
}

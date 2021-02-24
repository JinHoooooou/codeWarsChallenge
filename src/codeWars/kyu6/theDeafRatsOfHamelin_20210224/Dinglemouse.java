package codeWars.kyu6.theDeafRatsOfHamelin_20210224;

public class Dinglemouse {

  public static int countDeafRats(final String town) {
    String modifiedTown = modifyTown(town);
    String leftSide = modifiedTown.split("P")[0].trim();
    String rightSide = modifiedTown.split("P")[1].trim();

    return getDeafRats(leftSide, "O~") + getDeafRats(rightSide, "~O");
  }

  private static String modifyTown(String town) {
    return town.replaceAll(" ", "").replaceAll("P", " P ");
  }

  private static int getDeafRats(String side, String targetRat) {
    int deafCount = 0;

    while (!side.isEmpty()) {
      String rat = side.substring(0, 2);
      if (rat.equals(targetRat)) {
        deafCount++;
      }
      side = side.substring(2);
    }

    return deafCount;
  }
}

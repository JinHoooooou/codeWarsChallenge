package codeWars.kyu6.streetFighter_CharacterSelection_20201008;

public class Solution {

  public static String[] streetFighterSelection(String[][] fighters, int[] position,
      String[] moves) {
    String[] hoveredCharacters = new String[moves.length];
    int[] positionAfterMove = {position[0], position[1]};
    for (int i = 0; i < moves.length; i++) {
      hoveredCharacters[i] = movesCursor(fighters, positionAfterMove, moves[i]);
    }

    return hoveredCharacters;
  }

  private static String movesCursor(String[][] fighters, int[] positionAfterMove, String move) {
    int x = positionAfterMove[1];
    int y = positionAfterMove[0];
    switch (move) {
      case "left":
        x = x - 1 < 0 ? fighters[0].length - 1 : x - 1;
        break;
      case "right":
        x = (x + 1) % fighters[0].length;
        break;
      case "up":
        y = 0;
        break;
      case "down":
        y = 1;
        break;
    }
    positionAfterMove[0] = y;
    positionAfterMove[1] = x;
    return fighters[y][x];
  }
}

package codeWars.kyu8.rockPaperScissors_20200606;

public class Kata {

  public static final String PAPER = "paper";
  public static final String SCISSORS = "scissors";
  public static final String ROCK = "rock";

  public static final String PLAYER_1_WON = "Player 1 won!";
  public static final String PLAYER_2_WON = "Player 2 won!";
  public static final String DRAW = "Draw!";

  public static String rps(String p1, String p2) {
    if (p1.equals(p2)) {
      return DRAW;
    }
    switch (p1) {
      case SCISSORS:
        return p2.equals(PAPER) ? PLAYER_1_WON : PLAYER_2_WON;
      case ROCK:
        return p2.equals(SCISSORS) ? PLAYER_1_WON : PLAYER_2_WON;
      case PAPER:
        return p2.equals(ROCK) ? PLAYER_1_WON : PLAYER_2_WON;
    }

    return null;
  }
}

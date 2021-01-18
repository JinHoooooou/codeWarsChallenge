package codeWars.kyu5.snakesAndLadders_20210118;

import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {

  private Player currentPlayer;
  private Map<Integer, Integer> teleportMap;

  public SnakesLadders() {
    Player player1 = new Player(1);
    Player player2 = new Player(2);
    player1.setNextPlayer(player2);
    player2.setNextPlayer(player1);
    currentPlayer = player1;

    teleportMap = buildPortal();
  }

  private Map<Integer, Integer> buildPortal() {
    teleportMap = new HashMap<>();
    teleportMap.put(16, 6);
    teleportMap.put(46, 25);
    teleportMap.put(49, 11);
    teleportMap.put(62, 19);
    teleportMap.put(64, 60);
    teleportMap.put(74, 53);
    teleportMap.put(89, 68);
    teleportMap.put(92, 88);
    teleportMap.put(95, 75);
    teleportMap.put(99, 80);
    teleportMap.put(2, 38);
    teleportMap.put(7, 14);
    teleportMap.put(8, 31);
    teleportMap.put(15, 26);
    teleportMap.put(21, 42);
    teleportMap.put(28, 84);
    teleportMap.put(36, 44);
    teleportMap.put(51, 67);
    teleportMap.put(78, 98);
    teleportMap.put(71, 91);
    teleportMap.put(87, 94);

    return teleportMap;
  }

  public String play(int die1, int die2) {
    if (isGameOver()) {
      return "Game over!";
    }

    moves(die1 + die2);
    String resultMessage = getResultString();

    if (die1 != die2 || currentPlayer.getPosition() == 100) {
      currentPlayer = currentPlayer.getNextPlayer();
    }

    return resultMessage;
  }

  private boolean isGameOver() {
    return currentPlayer.getPosition() == 100 || currentPlayer.getNextPlayer().getPosition() == 100;
  }

  private String getResultString() {
    return currentPlayer.getPosition() == 100 ?
        String.format("Player %d Wins!", currentPlayer.getId()) :
        String.format("Player %d is on square %d", currentPlayer.getId(),
            currentPlayer.getPosition());
  }

  private void moves(int die) {
    int currentPosition = currentPlayer.getPosition() + die;
    if (currentPosition > 100) {
      currentPosition = 100 - (currentPosition - 100);
    }

    currentPlayer.setPosition(teleportMap.getOrDefault(currentPosition, currentPosition));
  }
}

class Player {

  private int id;
  private int position;
  private Player nextPlayer;

  public Player(int id) {
    this.id = id;
    this.position = 0;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public Player getNextPlayer() {
    return nextPlayer;
  }

  public void setNextPlayer(Player nextPlayer) {
    this.nextPlayer = nextPlayer;
  }

}
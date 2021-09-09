package programmers.constructTrack;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

  int result = 0;

  public int solution(int[][] board) {
    int[][] costMap = new int[board.length][board.length];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        costMap[i][j] = board[i][j];
      }
    }
    Queue<Block> queue = new LinkedList<>();
    queue.add(new Block(0, 0, 0, ""));

    int min = Integer.MAX_VALUE;
    while (!queue.isEmpty()) {
      Block current = queue.poll();
      if (current.y == costMap.length - 1 && current.x == costMap.length - 1) {
        min = Math.min(min, current.cost);
        continue;
      }
      if (current.y < 0 || current.y > costMap.length - 1) {
        continue;
      }
      if (current.x < 0 || current.x > costMap.length - 1) {
        continue;
      }
      if (costMap[current.y][current.x] == 1) {
        continue;
      }

      if (costMap[current.y][current.x] == 0) {
        costMap[current.y][current.x] = current.cost;
        moveLeft(queue, current);
        moveRight(queue, current);
        moveDown(queue, current);
        moveUp(queue, current);
      } else if (costMap[current.y][current.x] >= current.cost) {
        costMap[current.y][current.x] = current.cost;
        moveLeft(queue, current);
        moveRight(queue, current);
        moveDown(queue, current);
        moveUp(queue, current);
      }
    }
    return min;
  }

  private void moveUp(Queue<Block> queue, Block current) {
    int cost = 0;
    if (current.direction.equals("up") || current.direction.equals("")) {
      cost = current.cost + 100;
    } else {
      cost = current.cost + 600;
    }
    queue.add(new Block(current.y - 1, current.x, cost, "up"));
  }

  private void moveDown(Queue<Block> queue, Block current) {
    int cost = 0;
    if (current.direction.equals("down") || current.direction.equals("")) {
      cost = current.cost + 100;
    } else {
      cost = current.cost + 600;
    }
    queue.add(new Block(current.y + 1, current.x, cost, "down"));
  }

  private void moveRight(Queue<Block> queue, Block current) {
    int cost = 0;
    if (current.direction.equals("right") || current.direction.equals("")) {
      cost = current.cost + 100;
    } else {
      cost = current.cost + 600;
    }
    queue.add(new Block(current.y, current.x + 1, cost, "right"));

  }

  private void moveLeft(Queue<Block> queue, Block current) {
    int cost = 0;
    if (current.direction.equals("left") || current.direction.equals("")) {
      cost = current.cost + 100;
    } else {
      cost = current.cost + 600;
    }
    queue.add(new Block(current.y, current.x - 1, cost, "left"));
  }
}

class Block {

  public int y;
  public int x;
  public int cost;
  public String direction;

  public Block(int y, int x, int cost, String direction) {
    this.y = y;
    this.x = x;
    this.cost = cost;
    this.direction = direction;
  }

}

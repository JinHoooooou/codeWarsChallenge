package codeWars.kyu4.sortBinaryTreeByLevels_20210127;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kata {

  public static List<Integer> treeByLevels(Node node) {
    Queue<Node> queue = new LinkedList<>();
    List<Integer> result = new ArrayList<>();
    if (node != null) {
      queue.add(node);
    }
    while (!queue.isEmpty()) {
      Node current = queue.remove();
      result.add(current.value);
      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
    return result;
  }
}

class Node {

  public Node left;
  public Node right;
  public int value;

  public Node(Node l, Node r, int v) {
    this.left = l;
    this.right = r;
    this.value = v;
  }
}
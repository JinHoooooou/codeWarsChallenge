package programmers.길찾기게임;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

  public int[][] solution(int[][] nodeInfo) {
    Queue<Node> depthPriorityQueue = buildPriorityQueue(nodeInfo);
    Tree binaryTree = buildTree(depthPriorityQueue);

    binaryTree.preOrder(binaryTree.root);
    int[] preOrder = binaryTree.traversal.stream().mapToInt(x -> x).toArray();
    binaryTree.traversal.clear();

    binaryTree.postOrder(binaryTree.root);
    int[] postOrder = binaryTree.traversal.stream().mapToInt(x -> x).toArray();

    return new int[][]{preOrder, postOrder};
  }

  private Tree buildTree(Queue<Node> depthPriorityQueue) {
    Tree tree = new Tree();

    while (!depthPriorityQueue.isEmpty()) {
      Node newNode = depthPriorityQueue.poll();
      if (tree.root == null) {
        tree.root = newNode;
        continue;
      }
      Node current = tree.root;
      Node preNode = null;
      while (current != null) {
        if (newNode.x < current.x) {
          preNode = current;
          current = current.left;
        } else {
          preNode = current;
          current = current.right;
        }
      }
      if (newNode.x < preNode.x) {
        preNode.left = newNode;
      } else {
        preNode.right = newNode;
      }
    }
    return tree;
  }

  private Queue<Node> buildPriorityQueue(int[][] nodeInfo) {
    Queue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
      @Override
      public int compare(Node o1, Node o2) {
        return o1.y > o2.y ? -1 : 1;
      }
    });
    for (int i = 0; i < nodeInfo.length; i++) {
      queue.add(new Node(nodeInfo[i][0], nodeInfo[i][1], i + 1));
    }

    return queue;
  }
}

class Node {

  int x;
  int y;
  int value;
  Node left;
  Node right;

  public Node(int x, int y, int value) {
    this.x = x;
    this.y = y;
    this.value = value;
  }
}

class Tree {

  Node root;
  List<Integer> traversal = new ArrayList<>();

  public void preOrder(Node node) {
    if (node == null) {
      return;
    }
    visit(node);
    preOrder(node.left);
    preOrder(node.right);
  }

  public void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    visit(node);
  }

  private void visit(Node node) {
    traversal.add(node.value);
  }
}
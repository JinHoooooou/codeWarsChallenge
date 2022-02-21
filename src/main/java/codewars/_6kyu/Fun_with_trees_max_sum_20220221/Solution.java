package codewars._6kyu.Fun_with_trees_max_sum_20220221;

public class Solution {

  static int result;

  public static int maxSum(TreeNode root) {
    result = Integer.MIN_VALUE;

    dfs(root, 0);

    return result;
  }

  public static int maxSumBestPractice(TreeNode root) {
    return root.value + Math.max(maxSumBestPractice(root.left), maxSumBestPractice(root.right));
  }

  private static void dfs(TreeNode currentNode, int currentValue) {
    if (currentNode == null) {
      result = Math.max(currentValue, result);
      return;
    }

    currentValue += currentNode.value;

    dfs(currentNode.left, currentValue);
    dfs(currentNode.right, currentValue);
  }
}

class TreeNode {

  TreeNode left;
  TreeNode right;
  int value;

  public TreeNode(int value) {
    this.value = value;
  }

  public static TreeNode leaf(int value) {
    return new TreeNode(value);
  }

  public static TreeNode join(int value, TreeNode left, TreeNode right) {
    TreeNode root = leaf(value);
    root.left = left;
    root.right = right;
    return root;
  }

  public TreeNode withLeaves(int left, int right) {
    this.left = TreeNode.leaf(left);
    this.right = TreeNode.leaf(right);
    return this;
  }

}



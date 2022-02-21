package codewars._6kyu.Fun_with_trees_max_sum_20220221;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  public void testShouldReturn0WhenNullTree() {
    TreeNode root = null;
    assertThat(Solution.maxSum(root), is(0));
  }

  @Test
  public void testShouldReturn33() {
    TreeNode left = TreeNode.leaf(-22).withLeaves(9, 50);
    TreeNode right = TreeNode.leaf(11).withLeaves(9, 2);
    TreeNode root = TreeNode.join(5, left, right);
    assertThat(Solution.maxSum(root), is(33));
  }
}
package codeWars.kyu4.sortBinaryTreeByLevels_20210127;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

public class KataTest {

  @Test
  public void test1() {
    Node tree = makeTreeForTest1();
    assertThat(Kata.treeByLevels(tree), is(Arrays.asList(1, 2, 3, 4, 5, 6)));
  }

  private Node makeTreeForTest1() {
    Node tree = new Node(new Node(null, new Node(null, null, 4), 2),
        new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1);
    return tree;
  }

}
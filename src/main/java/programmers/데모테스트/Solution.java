package programmers.데모테스트;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Solution {

  @Test
  public void test1() {
    // Given: Set input
    int[][] v = {{1, 4}, {3, 4}, {3, 10}};

    assertArrayEquals(new int[]{1, 10}, solution(v));
  }

  public int[] solution(int[][] v) {
    int x = 0;
    int y = 0;
    if (v[0][0] == v[1][0]) {
      x = v[2][0];
    } else if (v[0][0] == v[2][0]) {
      x = v[1][0];
    } else {
      x = v[0][0];
    }
    if (v[0][1] == v[1][1]) {
      y = v[2][1];
    } else if (v[0][1] == v[2][1]) {
      y = v[1][1];
    } else {
      y = v[0][1];
    }

    return new int[]{x, y};
  }
}

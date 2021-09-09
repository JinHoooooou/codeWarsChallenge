package codeWars.kyu5.josephusPermutation_20200914;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class JosephusTest {

  @Test
  public void test1() {

    List<Integer> list = Josephus.josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
    assertArrayEquals(new Integer[]{3, 6, 2, 7, 5, 1, 4}, list.toArray(new Integer[0]));
  }
}
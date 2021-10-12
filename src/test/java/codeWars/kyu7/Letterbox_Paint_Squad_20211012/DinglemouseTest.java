package codeWars.kyu7.Letterbox_Paint_Squad_20211012;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DinglemouseTest {

  @Test
  @DisplayName("test should return {1,9,6,3,0,1,1,1,1,1} when start=125, end=132")
  public void test1() {
    assertThat(Dinglemouse.paintLetterboxes(125, 132), is(new int[]{1, 9, 6, 3, 0, 1, 1, 1, 1, 1}));
  }
}
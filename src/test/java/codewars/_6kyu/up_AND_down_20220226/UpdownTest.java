package codewars._6kyu.up_AND_down_20220226;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpdownTest {

  @Test
  public void test1() {
    String input = "after be arrived two My so";
    String expected = "be ARRIVED two AFTER my SO";
    assertThat(Updown.arrange(input), is(expected));
  }

  @Test
  public void test2() {
    String input = "who hit retaining The That a we taken";
    String expected = "who RETAINING hit THAT a THE we TAKEN";
    assertThat(Updown.arrange(input), is(expected));
  }

  @Test
  public void test3() {
    String input = "on I came up were so grandmothers";
    String expected = "i CAME on WERE up GRANDMOTHERS so";
    assertThat(Updown.arrange(input), is(expected));
  }

  @Test
  public void test4() {
    String input = "way the my wall them him";
    String expected = "way THE my WALL him THEM";
    assertThat(Updown.arrange(input), is(expected));
  }

  @Test
  public void test5() {
    String input = "turn know great-aunts aunt look A to back";
    String expected = "turn GREAT-AUNTS know AUNT a LOOK to BACK";
    assertThat(Updown.arrange(input), is(expected));
  }
}
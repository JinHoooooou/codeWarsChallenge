package codeWars.kyu7.Scaling_Squared_Strings_20211018;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ScaleTest {

  @Test
  public void test1() {
    String input = "abcd\n"
        + "efgh\n"
        + "ijkl\n"
        + "mnop";

    String expected = "aabbccdd\n"
        + "aabbccdd\n"
        + "aabbccdd\n"
        + "eeffgghh\n"
        + "eeffgghh\n"
        + "eeffgghh\n"
        + "iijjkkll\n"
        + "iijjkkll\n"
        + "iijjkkll\n"
        + "mmnnoopp\n"
        + "mmnnoopp\n"
        + "mmnnoopp";

    assertThat(Scale.scale(input, 2, 3), is(expected));
  }
}
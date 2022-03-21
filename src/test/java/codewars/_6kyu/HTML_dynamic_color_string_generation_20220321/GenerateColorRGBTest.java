package codewars._6kyu.HTML_dynamic_color_string_generation_20220321;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Test;

class GenerateColorRGBTest {

  @Test
  public void testShouldFail() {
    assertThat(GenerateColorRGB.generateColor(new Random()), is(""));
  }
}
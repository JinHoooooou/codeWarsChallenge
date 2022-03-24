package codewars._7kyu.Help_Suzuki_rake_his_garden_20220324;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test() {
    String input = "slug spider rock gravel gravel gravel gravel gravel gravel gravel";
    String expected = "gravel gravel rock gravel gravel gravel gravel gravel gravel gravel";
    assertThat(Kata.rakeGarden(input), is(expected));
  }
}
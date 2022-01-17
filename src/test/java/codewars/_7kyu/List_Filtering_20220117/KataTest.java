package codewars._7kyu.List_Filtering_20220117;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class KataTest {

  @Test
  public void test1() {
    assertThat(Kata.filterList(Arrays.asList(new Object[]{1, 2, "a", "b"})),
        is(Arrays.asList(new Object[]{1, 2})));
  }
}
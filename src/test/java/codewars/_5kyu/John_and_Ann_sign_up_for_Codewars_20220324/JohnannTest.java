package codewars._5kyu.John_and_Ann_sign_up_for_Codewars_20220324;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class JohnannTest {

  @Test
  public void test1() {
    long n = 6;
    List<Long> annExpected = Arrays.asList(1l, 1l, 2l, 2l, 3l, 3l);
    List<Long> johnExpected = Arrays.asList(0l, 0l, 1l, 2l, 2l, 3l);
    assertThat(Johnann.ann(n), is(annExpected));
    assertThat(Johnann.john(n), is(johnExpected));
    assertThat(Johnann.sumAnn(n), is(12L));
    assertThat(Johnann.sumJohn(n), is(8L));
  }

  @Test
  public void test2() {
    long n = 11;
    List<Long> annExpected = Arrays.asList(1l, 1l, 2l, 2l, 3l, 3l, 4l, 5l, 5l, 6l, 6l);
    List<Long> johnExpected = Arrays.asList(0l, 0l, 1l, 2l, 2l, 3l, 4l, 4l, 5l, 6l, 6l);
    assertThat(Johnann.ann(n), is(annExpected));
    assertThat(Johnann.john(n), is(johnExpected));
    assertThat(Johnann.sumAnn(n), is(38L));
    assertThat(Johnann.sumJohn(n), is(33L));
  }

  @Test
  public void test3() {
    long n = 75;
    assertThat(Johnann.sumJohn(n), is(1720L));
  }


  @Test
  public void test4() {
    long n = 150;
    assertThat(Johnann.sumAnn(n), is(6930L));
  }
  @Test
  public void test5() {
    long n = 115;
    assertThat(Johnann.sumAnn(n), is(4070L));
  }
}
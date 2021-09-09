package codeWars.kyu6.whatCenturyIsIt_20210117;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void testShouldReturn11thCentury() {
    assertThat(Solution.whatCentury(1000), is("11th"));
    assertThat(Solution.whatCentury(1018), is("11th"));
    assertThat(Solution.whatCentury(1084), is("11th"));
    assertThat(Solution.whatCentury(1099), is("11th"));
  }

  @Test
  public void testShouldReturn12thCentury() {
    assertThat(Solution.whatCentury(1100), is("12th"));
    assertThat(Solution.whatCentury(1134), is("12th"));
    assertThat(Solution.whatCentury(1186), is("12th"));
    assertThat(Solution.whatCentury(1199), is("12th"));
  }

  @Test
  public void testShouldReturnXXrdCentury() {
    assertThat(Solution.whatCentury(2200), is("23rd"));
    assertThat(Solution.whatCentury(5287), is("53rd"));
    assertThat(Solution.whatCentury(9299), is("93rd"));
  }

  @Test
  public void testShouldReturnXXndCentury() {
    assertThat(Solution.whatCentury(5100), is("52nd"));
    assertThat(Solution.whatCentury(7143), is("72nd"));
    assertThat(Solution.whatCentury(2199), is("22nd"));
  }

  @Test
  public void test() {
    assertThat(Solution.whatCentury(1999), is("20th"));
    assertThat(Solution.whatCentury(2011), is("21st"));
    assertThat(Solution.whatCentury(2154), is("22nd"));
    assertThat(Solution.whatCentury(2259), is("23rd"));
    assertThat(Solution.whatCentury(1124), is("12th"));
    assertThat(Solution.whatCentury(2000), is("21st"));
  }
}
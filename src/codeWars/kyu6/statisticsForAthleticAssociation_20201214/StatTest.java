package codeWars.kyu6.statisticsForAthleticAssociation_20201214;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class StatTest {

  @Test
  public void testWhenInputIsEmptyString() {
    String expected = "";
    String input = "";
    assertThat(Stat.stat(input), is(expected));
  }

  @Test
  public void testWhenInputSizeIs1() {
    String expected = "Range: 00|00|00 Average: 00|15|00 Median: 00|15|00";
    String input = "0|15|0";
    assertThat(Stat.stat(input), is(expected));
  }

  @Test
  public void testWhenInputSizeIsOdd() {
    String expected = "Range: 01|01|18 Average: 01|38|05 Median: 01|32|34";
    String input = "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17";
    assertThat(Stat.stat(input), is(expected));
  }

  @Test
  public void testWhenInputSizeIsEven() {
    String expected = "Range: 00|31|17 Average: 02|25|24 Median: 02|19|40";
    String input = "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00";
    assertThat(Stat.stat(input), is(expected));
  }

}
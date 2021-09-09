package codeWars.kyu4.parseIntReloaded_20201020;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ParserTest {

  @Test
  public void testShouldReturnOneDigitNumber() {
    assertThat(Parser.parseInt("zero"), is(0));
    assertThat(Parser.parseInt("one"), is(1));
    assertThat(Parser.parseInt("two"), is(2));
    assertThat(Parser.parseInt("three"), is(3));
    assertThat(Parser.parseInt("four"), is(4));
    assertThat(Parser.parseInt("five"), is(5));
    assertThat(Parser.parseInt("six"), is(6));
    assertThat(Parser.parseInt("seven"), is(7));
    assertThat(Parser.parseInt("eight"), is(8));
    assertThat(Parser.parseInt("nine"), is(9));
  }

  @Test
  public void testShouldReturnTwoDigitsNumberOrdinary() {
    assertThat(Parser.parseInt("twenty-four"), is(24));
    assertThat(Parser.parseInt("thirty-six"), is(36));
    assertThat(Parser.parseInt("forty-three"), is(43));
    assertThat(Parser.parseInt("fifty-one"), is(51));
    assertThat(Parser.parseInt("sixty-nine"), is(69));
    assertThat(Parser.parseInt("seventy-four"), is(74));
    assertThat(Parser.parseInt("eighty-two"), is(82));
    assertThat(Parser.parseInt("ninety-eight"), is(98));
  }

  @Test
  public void testShouldReturnTwoDigitsNumberUnique() {
    assertThat(Parser.parseInt("ten"), is(10));
    assertThat(Parser.parseInt("eleven"), is(11));
    assertThat(Parser.parseInt("twelve"), is(12));
    assertThat(Parser.parseInt("thirteen"), is(13));
    assertThat(Parser.parseInt("fourteen"), is(14));
    assertThat(Parser.parseInt("fifteen"), is(15));
    assertThat(Parser.parseInt("sixteen"), is(16));
    assertThat(Parser.parseInt("seventeen"), is(17));
    assertThat(Parser.parseInt("eighteen"), is(18));
    assertThat(Parser.parseInt("nineteen"), is(19));
    assertThat(Parser.parseInt("twenty"), is(20));
    assertThat(Parser.parseInt("thirty"), is(30));
    assertThat(Parser.parseInt("forty"), is(40));
    assertThat(Parser.parseInt("fifty"), is(50));
    assertThat(Parser.parseInt("sixty"), is(60));
    assertThat(Parser.parseInt("seventy"), is(70));
    assertThat(Parser.parseInt("eighty"), is(80));
    assertThat(Parser.parseInt("ninety"), is(90));
  }

  @Test
  public void testShouldReturnThreeDigitsNumber() {
    assertThat(Parser.parseInt("one hundred"), is(100));
    assertThat(Parser.parseInt("two hundred fifty-five"), is(255));
    assertThat(Parser.parseInt("three hundred and fourteen"), is(314));
    assertThat(Parser.parseInt("four hundred seventy-six"), is(476));
    assertThat(Parser.parseInt("five hundred and ten "), is(510));
    assertThat(Parser.parseInt("six hundred sixty-six"), is(666));
    assertThat(Parser.parseInt("seven hundred and two"), is(702));
    assertThat(Parser.parseInt("eight hundred ninety-two"), is(892));
    assertThat(Parser.parseInt("nine hundred and fifty"), is(950));
  }

  @Test
  public void testShouldReturnFourDigitsNumber() {
    assertThat(Parser.parseInt("one thousand"), is(1000));
    assertThat(Parser.parseInt("two thousand one hundred fifty-five"), is(2155));
    assertThat(Parser.parseInt("three thousand three hundred"), is(3300));
    assertThat(Parser.parseInt("four thousand one"), is(4001));
    assertThat(Parser.parseInt("five thousand and sixteen"), is(5016));
    assertThat(Parser.parseInt("six thousand and five hundred sixty-seven"), is(6567));
    assertThat(Parser.parseInt("seven thousand three hundred two"), is(7302));
    assertThat(Parser.parseInt("eight thousand twenty"), is(8020));
    assertThat(Parser.parseInt("nine thousand nine hundred ninety-nine"), is(9999));
  }

  @Test
  public void testShouldReturnMoreThanFourDigitsNumber() {
    assertThat(Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"),
        is(783919));
    assertThat(Parser.parseInt("one million"), is(1000000));
    assertThat(Parser.parseInt("nine hundred ninety-nine thousand nine hundred and nineteen"),
        is(999919));
  }
}
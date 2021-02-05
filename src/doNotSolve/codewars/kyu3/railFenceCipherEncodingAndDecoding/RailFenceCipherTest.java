package doNotSolve.codewars.kyu3.railFenceCipherEncodingAndDecoding;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RailFenceCipherTest {

  @Test
  public void encodingTest() {
    assertThat(RailFenceCipher.encode("Hello, World!", 4), is("H !e,Wdloollr"));
  }

  @Test
  public void decodingTest() {
    assertThat(RailFenceCipher.decode("H !e,Wdloollr", 4), is("Hello, World!"));
  }
}
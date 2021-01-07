package doNotSolve.codewars.kyu4.decodeTheMorseCodeAdvanced;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MorseCodeDecoderTest {

  @Test
  public void test1() {
    String bits = "10101010001000111010111011100000001011101110111000101011100011101010001";
    String morseCode = MorseCodeDecoder.decodeBits(bits);
    assertThat(MorseCodeDecoder.decodeMorse(morseCode), is("HEY JUDE"));
  }

  @Test
  public void test2() {
    String bits = "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011";
    String morseCode = MorseCodeDecoder.decodeBits(bits);
    assertThat(MorseCodeDecoder.decodeMorse(morseCode), is("HEY JUDE"));
  }

  @Test
  public void test3() {
    String bits = "01110";
    String morseCode = MorseCodeDecoder.decodeBits(bits);
    assertThat(MorseCodeDecoder.decodeMorse(morseCode), is("E"));
  }
}
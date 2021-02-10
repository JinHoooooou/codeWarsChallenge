package codeWars.kyu5.firstVariationOnCaesarCipher_20210210;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class CaesarCipherTest {

  @Test
  public void encodingTest() {
    String u = "I should have known that you would have a perfect answer for me!!!";
    List<String> v = Arrays
        .asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv",
            " lvz wp!!!");
    assertThat(CaesarCipher.movingShift(u, 1), is(v));
  }

  @Test
  public void decodingTest() {
    String u = "I should have known that you would have a perfect answer for me!!!";
    List<String> v = CaesarCipher.movingShift(u, 1);
    assertThat(CaesarCipher.demovingShift(v, 1), is(u));
  }
}
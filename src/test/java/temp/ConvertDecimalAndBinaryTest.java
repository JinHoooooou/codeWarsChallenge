package temp;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class ConvertDecimalAndBinaryTest {

  @Test
  public void testConvertDecimalToBinary() {
    int decimal = 21;
    String binary = Integer.toBinaryString(decimal);
    System.out.println(String.format("Decimal: %d -> Binary: %s", decimal, binary));
    assertThat(binary, is("10101"));
  }

  @Test
  public void testConvertBinaryToDecimal() {
    String binary = "1011010";
    int decimal = Integer.parseInt(binary, 2);
    System.out.println(String.format("Binary: %s -> Decimal: %s", binary, decimal));
    assertThat(decimal, is(90));
  }
}

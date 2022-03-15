package codewars._6kyu.Easy_Balance_Checking_20220315;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EasyBalTest {

  @Test
  public void test1() {
    String input =
        "1000.00!=\n"
            + "125 Market !=:125.45\n"
            + "126 Hardware =34.95\n"
            + "127 Video! 7.45\n"
            + "128 Book   :14.32\n"
            + "129 Gasoline ::16.10";
    String expected = "Original Balance: 1000.00\\r\\n"
        + "125 Market 125.45 Balance 874.55\\r\\n"
        + "126 Hardware 34.95 Balance 839.60\\r\\n"
        + "127 Video 7.45 Balance 832.15\\r\\n"
        + "128 Book 14.32 Balance 817.83\\r\\n"
        + "129 Gasoline 16.10 Balance 801.73\\r\\n"
        + "Total expense  198.27\\r\\n"
        + "Average expense  39.65";

    assertThat(EasyBal.balance(input), is(expected));
  }
}
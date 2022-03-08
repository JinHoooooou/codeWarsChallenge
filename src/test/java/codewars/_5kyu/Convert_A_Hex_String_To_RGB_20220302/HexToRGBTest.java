package codewars._5kyu.Convert_A_Hex_String_To_RGB_20220302;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class HexToRGBTest {

  @Test
  public void test1() {
    String hex = "#000000";
    int[] expected = {0, 0, 0};
    assertThat(HexToRGB.hexStringToRGB(hex), is(expected));
  }

  @Test
  public void test2() {
    String hex = "#FF9933";
    int[] expected = {255, 153, 51};
    assertThat(HexToRGB.hexStringToRGB(hex), is(expected));
  }

  @Test
  public void test3() {
    String hex = "#111111";
    int[] expected = {17, 17, 17};
    assertThat(HexToRGB.hexStringToRGB(hex), is(expected));
  }

  @Test
  public void test4() {
    String hex = "#beaded";
    int[] expected = {190, 173, 237};
    assertThat(HexToRGB.hexStringToRGB(hex), is(expected));
  }

  @Test
  public void test5() {
    String hex = "#Fa3456";
    int[] expected = {250, 52, 86};
    assertThat(HexToRGB.hexStringToRGB(hex), is(expected));
  }
}
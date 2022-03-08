package codewars._6kyu.Basic_Encryption_20220308;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicEncryptTest {

  @Test
  public void test1() {
    String text = "a";
    int rule = 1;

    String expected = "b";

    assertThat(BasicEncrypt.encrypt(text, rule), is(expected));
  }

  @Test
  public void test2() {
    String text = "please encrypt me";
    int rule = 2;

    String expected = "rngcug\"gpet{rv\"og";

    assertThat(BasicEncrypt.encrypt(text, rule), is(expected));
  }
}
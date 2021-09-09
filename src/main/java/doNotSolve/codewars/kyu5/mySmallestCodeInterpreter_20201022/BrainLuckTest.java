package doNotSolve.codewars.kyu5.mySmallestCodeInterpreter_20201022;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BrainLuckTest {

  @Test
  public void testEchoUntilByte255Encountered() {
    assertThat(new BrainLuck(",+[-.,+]").process("Codewars" + ((char) 255)), is("Codewars"));
  }

  @Test
  public void testEchoUntilByte0Encountered() {
    assertThat(new BrainLuck(",[.[-],]").process("Codewars" + ((char) 0)), is("Codewars"));
  }

  @Test
  public void testTwoNumbersMultiplier() {
    char[] input = {8, 9};
    assertThat(new BrainLuck(",>,<[>[->+>+<<]>>[-<<+>>]<<<-]>>.")
            .process(String.valueOf(input[0]) + String.valueOf(input[1])),
        is(String.valueOf((char) (input[0] * input[1]))));
  }
}
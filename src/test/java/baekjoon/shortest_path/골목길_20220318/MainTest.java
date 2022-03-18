package baekjoon.shortest_path.골목길_20220318;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  public void test1() throws IOException {
    String input = "5 7\n"
        + "1 2 3\n"
        + "1 3 4\n"
        + "3 1 -7\n"
        + "2 3 2\n"
        + "3 4 1\n"
        + "4 2 -5\n"
        + "4 5 1";

    OutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Main.main(new String[]{});
    

    String expected = "1 2 3 4 5";
    assertThat(out.toString(), is(expected));
  }
}